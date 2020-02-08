<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>登录页面</h1>
<form action="login" method="post">
	<table>
		<tr>
		<td>username：</td>
		<td><input type="text" name="username" value="${username }"/></td>
		</tr>
		<tr>
		<td>password：</td>
		<td><input type="password" name="password" value="${password }"/></td>
		</tr>	
		<tr>
		<td colspan="1"></td>
		<td><input type="submit" value="登录"/></td>
		<td><font color="red">${erro}</font></td>
		</tr>	
			
	</table>


</form>

</body>
</html>