<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<h1>
		<strong>Login</strong>
	</h1>
	<form action="" method="post">
		<table>
			<tr>
				<td>${error}</td>
			</tr>
			<tr>
				<td><label>Username:</label></td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td><label>Password:</label></td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>