package com.lms;

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
 * Servlet implementation class IssueBook
 */
@WebServlet("/IssueBook")
public class IssueBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IssueBook() {
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
//		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Issue Book</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("userHome.jsp").include(request, response);
		
		out.println("<div class='container'>");
		String strbookId=request.getParameter("bookId");
		String struserId=request.getParameter("userId");
		String dateOfIssue=request.getParameter("dateOfIssue");
		String dueDate=request.getParameter("dueDate");
		int bookId= Integer.parseInt(strbookId);
		int userId = Integer.parseInt(struserId);
		
		Transaction transaction=new Transaction(bookId,userId,dateOfIssue,dueDate);
		int i=bookHelper.issueBook(transaction);
		if(i>0){
			out.println("<h3>Book issued successfully</h3>");
		}else{
			out.println("<h3>Sorry, unable to issue book.</h3><p>Kindly visit later.</p>");
		}
		out.println("</div>");

		out.close();
	}

}
