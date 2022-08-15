package com.lms.helpers;

import com.lms.entity.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.lms.entity.BookDetails;


public class bookHelper {
	//function to save new book
	public static int save(BookDetails book){
		int status=0;
		try{
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into book_details(book_name,book_author,book_price,status,edition,date_of_purchase,number_of_copies) values(?,?,?,?,?,?,?)");
			ps.setString(1,book.getBookName());
			ps.setString(2,book.getBookAuthor());
			ps.setInt(3,book.getBookPrice());
			ps.setString(4,book.getStatus());
			ps.setString(5,  book.getEdition());
			ps.setString(6, book.getDateOfPurchase());
			ps.setInt(7,book.getNumberOfCopies());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//function to view all books in database
	public static List<BookDetails> view(){
		List<BookDetails> list=new ArrayList<BookDetails>();
		try{
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from book_details");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				BookDetails book=new BookDetails();
				book.setBookId(rs.getInt("book_id"));
				book.setBookName(rs.getString("book_name"));
				book.setBookAuthor(rs.getString("book_author"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setStatus(rs.getString("status"));
				book.setEdition(rs.getString("edition"));
				book.setDateOfPurchase(rs.getString("date_of_purchase"));
				book.setNumberOfCopies(rs.getInt("number_of_copies"));
				
				list.add(book);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	
	//function to delete book
	public static int delete(String bookId){
		int status=0;
		try{
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from book_details where book_id=?");
			ps.setString(1,bookId);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}

	//helper function to check if user has crossed maximum book limit
	public static boolean checkMaxLimitExceeded(int userId) throws SQLException {
		int numberOfIssuedBooks =10;
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement("select number_of_issuedBooks from users where user_id=?");
		ps.setInt(1, userId);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			numberOfIssuedBooks = rs.getInt("number_of_issuedBooks");
		}
		if(numberOfIssuedBooks<10)
			return true;
		
		return false;
	}
	
	//function to issue book
	public static int issueBook(Transaction transaction){
		int status=0;
		try{
				if(checkMaxLimitExceeded(transaction.getUserId()))
					return status;
				
				Connection con=ConnectionFactory.getConnection();	
				PreparedStatement ps=con.prepareStatement("insert into transactions(user_id,book_id,date_of_issue,due_date,transaction_status,fine) values(?,?,?,?,?,?)");
				ps.setInt(1,transaction.getBookId());
				ps.setInt(2,transaction.getUserId());
				ps.setString(3,transaction.getDateOfIssue());
				ps.setString(4,transaction.getDueDate());
				ps.setString(5,"issued");
				ps.setInt(6,0);
				
				status=ps.executeUpdate();
				if(status>0){
					PreparedStatement ps2=con.prepareStatement("update book_details set status=? where book_id=?");
					ps2.setString(1,"issued");
					ps2.setInt(2,transaction.getBookId());
					status=ps2.executeUpdate();
				}
				if(status>0){
					PreparedStatement ps3=con.prepareStatement("update book_details set number_of_copies=? where book_id=?");
					ps3.setString(1,"issued");
					ps3.setInt(2,transaction.getBookId());
					status=ps3.executeUpdate();
				}
				if(status>0){
					PreparedStatement ps4=con.prepareStatement("update users set number_of_issuedBooks=number_of_issuedBooks +1 where user_id=?");
					ps4.setInt(1,transaction.getUserId());
					status=ps4.executeUpdate();
				}
				con.close();
				
			}catch(Exception e){System.out.println(e);}
			
			return status;

	}
	
	//function to return book
	public static int returnBook(int bookId,int userId){
		int status=0;
			try{
				Connection con=ConnectionFactory.getConnection();
				
				PreparedStatement ps=con.prepareStatement("delete from transactions where book_id=? And user_id=?");
				ps.setInt(1,bookId);
				ps.setInt(2,userId);
				
				status=ps.executeUpdate();
				if(status>0){
					PreparedStatement ps2=con.prepareStatement("update book_details set status=\"new\" where book_id=?");
					ps2.setInt(1,bookId);
					status=ps2.executeUpdate();
				}
				if(status>0){
					PreparedStatement ps3=con.prepareStatement("update user_details set number_of_issuedBooks=number_of_issuedBooks -1 where user_id=?");
					ps3.setInt(1,userId);
					status=ps3.executeUpdate();
				}
				
				con.close();
				
			}catch(Exception e){System.out.println(e);}
//			
			return status;
	}
	

}
