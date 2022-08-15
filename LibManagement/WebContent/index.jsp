<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management System</title>
<link rel="stylesheet" href="bootstrap.min.css"/>
</head>
<body>
<h1>Welcome to Library Management System</h1>

<div class="container-fluid">

<div class="row">
  <div class="col-md-4">
  <h3>Admin Login</h3>
  <form action="<%= request.getContextPath() %>/AdminLogin" method="post" style="width:300px">
  <div class="form-group">
    <label for="username">User Name</label>
    <input type="text" class="form-control" name="username" id="username" placeholder="username" required/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" name="password" id="password1" placeholder="Password" required/>
  </div>  
  <button type="submit" class="btn btn-primary">Login</button>
</form>
  
  </div>
  
  
  <div class="col-md-4">
  <h3>User Registration</h3>
  <form action="<%= request.getContextPath() %>/register" method="post" style="width:300px">
  <div class="form-group">
    <label for="username">User Name</label>
    <input type="text" class="form-control" name="username" id="username" placeholder="username" required/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" pattern= "(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" id="password1" name="password" placeholder="Password" required/>
  </div>  
  <div class="form-group">
    <label for="address">Address</label>
    <input type="text" class="form-control" name="address" id="address" placeholder="Address" required/>
  </div>
  <div class="form-group">
    <label for="emailId">Email Id</label>
    <input type="email" class="form-control" name="emailId" id="emailId" placeholder="Email-Id" required/>
  </div>
  <div class="form-group">
    <label for="phoneNumber">Phone Number</label>
    <input type="tel" class="form-control" pattern=".{10}" name="phoneNumber" id="phoneNumber" placeholder="phoneNumber" required/>
  </div>
  <button type="submit" class="btn btn-primary">Register</button>
</form>
</div>


  <div class="col-md-4">
  <h3>User Login</h3>
  <form action="<%= request.getContextPath() %>/UserLogin" method="post" style="width:300px">
  <div class="form-group">
    <label for="username">User Name</label>
    <input type="text" class="form-control" name="username" id="username" placeholder="username" required/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" id="password" name="password" placeholder="Password" required/>
  </div>  
  <button type="submit" class="btn btn-primary">Login</button>
</form>
</div>
  </div>
</div>


</body>
</html>