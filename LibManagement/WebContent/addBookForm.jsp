<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book Form</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
</head>
<body>
<div class="container">
<h3>Add Book</h3>
  <form action="<%= request.getContextPath() %>/AddBook" method="post" style="width:300px">
  <div class="form-group">
    <label for="name1">Name</label>
    <input type="text" class="form-control" name="bookName" id="bookName1" placeholder="bookName"/>
  </div>
  <div class="form-group">
    <label for="author1">Author</label>
    <input type="text" class="form-control" name="bookAuthor" id="bookAuthor1" placeholder="bookAuthor"/>
  </div>
  <div class="form-group">
    <label for="bookPrice1">Book Price</label>
    <input type="number" class="form-control" name="bookPrice" id="bookPrice1" placeholder="bookPrice"/>
  </div>
  <div class="form-group">
    <label for="status1">Status</label>
    <input type="text" class="form-control" name="status" id="status1" placeholder="status"/>
  </div>
  <div class="form-group">
    <label for="edition1">Edition</label>
    <input type="text" class="form-control" name="edition" id="edition1" placeholder="edition"/>
  </div>
  <div class="form-group">
    <label for="dateOfPurchase1">Date of Purchase</label>
    <input type="date" class="form-control" name="dateOfPurchase" id="dateOfPurchase1" placeholder="dateOfPurchase"/>
  </div>
  <div class="form-group">
    <label for="numberOfCopies">Number of Copies</label>
    <input type="number" class="form-control" name="numberOfCopies" id="numberOfCopies1" placeholder="numberOfCopies"/>
  </div>
  <button type="submit" class="btn btn-primary">Save Book</button>
  </form>
  </div>
</body>
</html>