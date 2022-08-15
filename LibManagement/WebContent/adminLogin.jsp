<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminLogin</title>
</head>
<body>
<h3>Admin Login</h3>
  <form action="AdminLogin" method="post" style="width:300px">
  <div class="form-group">
    <label for="email1">User Name</label>
    <input type="text" class="form-control" name="username" id="username" placeholder="username"/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" name="password" id="password1" placeholder="Password"/>
  </div>  
  <button type="submit" class="btn btn-primary">Login</button>
</form>
</body>
</html>