package com.lms.helpers;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.lms.entity.UserDetails;


public class userHelper {
	//function to save new user
	public static int save(UserDetails user){
		int status=0;
		try{
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into users(user_name,password,address,max_book_limit,number_of_issuedBooks, email_id,phone_number) values(?,?,?,?,?,?,?)");
			ps.setString(1,user.getUserName());
			ps.setString(2,user.getPassword());
			ps.setString(3,user.getAddress());
			ps.setInt(4,10);
			ps.setInt(5,0);
			ps.setString(6,user.getEmailId());
			ps.setString(7, user.getPhoneNumber());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	//function to view all users
	public static List<UserDetails> view(){
		List<UserDetails> list=new ArrayList<UserDetails>();
		try{
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement ps=con.prepareStatement("select user_id,user_name,email_id,phone_number from users");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				UserDetails user=new UserDetails();
				user.setUserId(rs.getInt("user_id"));
				user.setUserName(rs.getString("user_name"));
//				user.setPassword(rs.getString("password"));
//				user.setAddress(rs.getString("address"));
//				user.setMaxBookLimit(rs.getInt("max_book_limit"));
//				user.setNumberOfIssuedBooks(rs.getInt("number_of_issuedBooks"));
				user.setEmailId(rs.getString("email_id"));
				user.setPhoneNumber(rs.getString("phone_number"));
				
				list.add(user);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}

	//function to login user
	public static boolean login(String userName,String password){
		boolean status=false;
		try{
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from users where user_name=? and password=?");
			ps.setString(1,userName);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				status=true;
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}

}
