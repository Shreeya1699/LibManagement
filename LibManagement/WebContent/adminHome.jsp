<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
   
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="index.jsp">Home</a></li>
        <li><a href="addBookForm.jsp" >Add Books</a></li>
        <li><a href="<%= request.getContextPath() %>/ViewBook">View Books</a></li>
        <li><a href="<%= request.getContextPath() %>/AdminLogout">Logout</a></li>
       </ul>

    </div>
  </div>
  

</body>
</html>