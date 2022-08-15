<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LMS</title>
</head>
<body>
<div align="center">
	<h1>User Registration Form</h1>
	<form action ="<%= request.getContextPath() %>/register" method= "post">
		<table style="with: 80%">
			<tr>
				<td>UserName</td>
				<td><input type="text" name="user_name"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"/></td>
			</tr>
			<tr>
				<td>Email-ID</td>
				<td><input type="text" name="email_id"/></td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td><input type="text" name="phone_number"/></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form>
</div>
</body>
</html>