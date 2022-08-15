<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Return Book</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
</head>
<body>
<div class="container">
<h2>Return Book Form</h2>
<form action="ReturnBook" method="post" style="width:300px">
  <div class="form-group">
    <label for="bookId">BookId</label>
    <input type="text" class="form-control" name="bookId" id="bookId" placeholder="BookId"/>
  </div>
  <div class="form-group">
    <label for="userId">User Id</label>
    <input type="text" class="form-control" name="userId" id="userId" placeholder="User Id"/>
  </div>
  <button type="submit" class="btn btn-primary">Return Book</button>
</form>
<</div>
</body>
</html>