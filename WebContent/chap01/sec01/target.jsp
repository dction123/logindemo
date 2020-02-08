<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="student" scope="page" class="com.liang.model.Student"/>
<jsp:setProperty property="*" name="student"/>

<p>name:<%= student.getName() %></p>
<p>age:<%= student.getAge() %></p>

<p>----------------------------</p>
<h2>jsp:getProperty</h2>
<p>name:<jsp:getProperty property="name" name="student"/></p>
<p>age:<jsp:getProperty property="age" name="student"/></p>




</body>
</html>