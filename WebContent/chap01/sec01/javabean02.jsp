<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" scope="page" class="com.liang.model.Student"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studyservletandjsp</title>
</head>
<body>

<%
	student.setName("xiaomm");
	student.setAge(18);
	
%>


<p>name: <%= student.getName() %> </p>
<p>age:<%= student.getAge() %></p>
</body>
</html>