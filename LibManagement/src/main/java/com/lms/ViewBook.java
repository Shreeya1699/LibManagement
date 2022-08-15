package com.lms;

import java.io.IOException;
import com.lms.entity.*;
import com.lms.helpers.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;
/**
 * Servlet implementation class ViewBook
 */
@WebServlet("/ViewBook")
public class ViewBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>View Book</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 class=\"mb-3\" style=\"text-align:center\">Book Collection</h2>");
		out.println("<div class='container'>");
		
		List<BookDetails> list=bookHelper.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Book Id</th><th>Book Name</th><th>Author</th><th>Book Price</th><th>Status</th><th>Edition</th><th>Date of Purchase</th><th>Number of Copies</th><th>Delete</th></tr>");
		for(BookDetails book:list){
			out.println("<tr><td>"+book.getBookId()+"</td><td>"+book.getBookName()+"</td><td>"+book.getBookAuthor()+"</td><td>"+book.getBookPrice()+"</td><td>"+book.getStatus()+"</td><td>"+book.getEdition()+"</td><td>"+book.getDateOfPurchase()+"</td><td>"+book.getNumberOfCopies()+"</td><td><a href='DeleteBook?book_id="+book.getBookId()+"'>Delete</a></td></tr>");
		}
		out.println("</table>");
		
		out.println("</div>");

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
