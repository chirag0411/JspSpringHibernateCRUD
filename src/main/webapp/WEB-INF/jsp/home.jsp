<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management</title>
</head>
<body>
<body>
	<div align="center">
		<h1>Student List</h1>
		<table border="1">
			<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Roll No</th>
			<th>Telephone</th>
			<th>Action</th>
			</tr>
			<c:forEach var="student" items="${studentList}">
				<tr>
					<td>${student.name}</td>
					<td>${student.email}</td>
					<td>${student.address}</td>
					<td>${student.rollNo}</td>
					<td>${student.telephone}</td>
					<td><a href="editStudent?id=${student.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteStudent?id=${student.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<h4>
			New Student Register <a href="newStudent">here</a>
		</h4>
	</div>
</body>
</body>
</html>