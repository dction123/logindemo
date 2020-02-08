<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>演示scope 范围</title>
</head>
<body> 
<h1>scope 中设置不同范围演示-request</h1>
<jsp:useBean id="student" scope="request" class="com.liang.model.Student"></jsp:useBean>
<jsp:setProperty property="name" name="student" value="dawei"/>
<jsp:setProperty property="age" name="student" value="19"/>
<jsp:forward page="target03.jsp"></jsp:forward>

</body>
</html>