<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<sec:authorize access="hasRole('ROLE_ADMIN')">
		<h3>
			<a href="/logout">logout</a>
		</h3>
		<br>
		<h1>
			<strong>ADMIN</strong>
		</h1>
		<div class="bookDetailsDiv">
			<table id="book">
				<thead>
					<tr>
						<th><label>Title</label></th>
						<th><label>Author</label></th>
						<th><label>Published</label></th>
						<th></th>
					</tr>
				</thead>
				<tbody class="bookTBody">
				</tbody>
			</table>
			<div class="addBookDetailsDiv">
				<table id="addBook">
					<tr>
						<th><label>Title</label></th>
						<td><input type="text" id="title" /></td>
					</tr>
					<tr>
						<th><label>Author</label></th>
						<td><input type="text" id="author" /></td>
					</tr>
					<tr>
						<th><label>Published</label></th>
						<td><input type="date" id="published" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="add" /></td>
					</tr>
				</table>
			</div>
			<div class="editBookDetailsDiv">
				<table id="addBook">
					<tr>
						<th><label>Title</label></th>
						<td><input type="text" id="title" /></td>
					</tr>
					<tr>
						<th><label>Author</label></th>
						<td><input type="text" id="author" /></td>
					</tr>
					<tr>
						<th><label>Published</label></th>
						<td><input type="date" id="published" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Update" /></td>
					</tr>
				</table>
			</div>
		</div>
	</sec:authorize>
</body>
<script type="text/javascript" src="/resources/js/admin.js"></script>
</html>