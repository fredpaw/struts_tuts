<%@ page language="java" contentType="text/html; GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; GBK">
<title>Struts Demo 1</title>
</head>
<body>
	<h1>Struts 实例</h1>
	<a href="login.jsp">简单登录</a><br>
	<a href="must_login.do">访问受保护的页面</a><br>
	<form action="dyna_actionforward.do" method="post">
		<label>动态ActionForward</label>
		<input type="text" name="page">
		<input type="submit" value="Submit"><br>
	</form>
</body>
</html>