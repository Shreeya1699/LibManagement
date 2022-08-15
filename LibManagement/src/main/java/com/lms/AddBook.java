package com.lms;

import java.text.ParseException;
import java.text.SimpleDateFormat;  

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.lms.entity.*;
import com.lms.helpers.*;



/**
 * Servlet implementation class AddBook
 */
@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Add Book Form</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("adminHome.jsp").include(request, response);
		
		out.println("<div class='container'>");
		String name=request.getParameter("bookName");
		String author=request.getParameter("bookAuthor");
		String strPrice=request.getParameter("bookPrice");
		String status=request.getParameter("status");
		String edition=request.getParameter("edition");
		String strDateOfPurchase=request.getParameter("dateOfPurchase");
		String strNumberOfCopies=request.getParameter("numberOfCopies");
		int price=Integer.parseInt(strPrice);
		
//		Date dateOfPurchase = new Date();
//		try {
//			dateOfPurchase = new SimpleDateFormat("dd/MM/yyyy").parse(strDateOfPurchase);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		int numberOfCopies = Integer.parseInt(strNumberOfCopies);
		BookDetails book=new BookDetails(name,author,price,status,edition,strDateOfPurchase,numberOfCopies);
		int i=bookHelper.save(book);
		if(i>0){
			out.println("<h3>Book saved successfully</h3>");
		}
		request.getRequestDispatcher("addBookForm.jsp").include(request, response);
		out.println("</div>");
		
		
		request.getRequestDispatcher("#").include(request, response);
		out.close();
	}

}
