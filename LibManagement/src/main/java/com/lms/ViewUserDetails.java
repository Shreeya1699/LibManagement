package com.lms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.entity.*;
import com.lms.helpers.*;

/**
 * Servlet implementation class ViewUserDetails
 */
@WebServlet("/ViewUserDetails")
public class ViewUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewUserDetails() {
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
		out.println("<title>View My Details</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 class=\"mb-3\" style=\"text-align:center\">User Profiles</h2>");
		out.println("<div class='container'>");
		
		List<UserDetails> list=userHelper.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>User Id</th><th>User Name</th><th>Email Id</th><th>Phone Number</th>");
		for(UserDetails user:list){
			out.println("<tr><td>"+user.getUserId()+"</td><td>"+user.getUserName()+"</td><td>"+user.getEmailId()+"</td><td>"+user.getPhoneNumber()+"</td>");
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
