<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="index.jsp">Home</a></li>
        <li><a href="<%= request.getContextPath() %>/ViewUserDetails">View User Details</a></li> 
        <li><a href="<%= request.getContextPath() %>/ViewBook">View Books</a></li>
        <li><a href="issueBookForm.jsp">Issue Book</a></li>
        <li><a href="returnBookForm.jsp">Return Book</a></li>
        <li><a href="LogoutUser">Logout</a></li>
       </ul>

    </div>
  </div>
</nav>
</body>
</html>