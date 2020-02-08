<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>客户端转发/重定向</h1>

<p>request:<%=request.getAttribute("requestkey") %></p>
<p>session:<%=session.getAttribute("sessionkey") %></p>
<p>application:<%= application.getAttribute("applicationkey") %></p>
</body>
</html>