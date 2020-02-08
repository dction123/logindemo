<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.liang.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studyservletandjsp</title>
</head>
<body>

<%
	Student st = new Student("小明",18);
	

%>
<h1>studyservletandjsp</h1> 
<p>name:<%= st.getName() %></p>
<p>age:<%= st.getAge() %></p>
</body>
</html>