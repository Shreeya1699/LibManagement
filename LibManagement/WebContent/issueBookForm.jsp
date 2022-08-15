<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IssueBook</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
</head>
<body>
<div class= "container">
	<h3 class ="mb-3">Issue Book</h3>
  <form action="IssueBook" method="post" style="width:300px">
  <div class="form-group">
    <label for="bookId">Book Id</label>
    <input type="number" class="form-control" name="bookId" id="bookId" placeholder="Book Id"/>
  </div>
  <div class="form-group">
    <label for="userId">User Id</label>
    <input type="number" class="form-control" name="userId" id="userId" placeholder="User Id"/>
  </div>
  <div class="form-group">
    <label for="dateOfIssue">Date Of Issue</label>
    <input type="Date" class="form-control" name="dateOfIssue" id="dateOfIssue" placeholder="Date Of Issue"/>
  </div>
   <div class="form-group">
    <label for="dueDate">Due Date</label>
    <input type="Date" class="form-control" name="dueDate" id="dueDate" placeholder="Due Date"/>
  </div>
  <button type="submit" class="btn btn-primary">Issue Book</button>
</form>
</div>
</body>
</html>