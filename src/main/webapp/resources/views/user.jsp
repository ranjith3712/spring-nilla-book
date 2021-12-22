<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
</head>
<body>
	<h1>
		<strong>Books</strong>
	</h1>

	<%-- 	<c:if test="${isAllowed}!=null"> --%>
	<%-- 		<h3>${isAllowed}</h3> --%>
	<%-- 	</c:if> --%>
	<h3>${isAllowed}</h3>
	<%-- 	<sec:authorize access="isAuthenticated()"> --%>
	<a href="/logout">logout</a>
	<%-- 	</sec:authorize> --%>
	<h1>home</h1>
	<%-- 	<sec:authorize access="has('ROLE_USER')"> --%>
	<table id="book">
		<thead>
			<tr>
				<th><label>Title</label></th>
				<th><label>Author</label></th>
				<th><label>Published</label></th>
			</tr>
		</thead>
		<tbody class="bookTBody">
		</tbody>
	</table>
	<%-- 	</sec:authorize> --%>
</body>
<script type="text/javascript"
	src="/resources/js/additional/jquery.min.js"></script>
<script type="text/javascript" src="/resources/js/user.js"></script>
</html>