<%@ page language="java" contentType="text/html; GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; GBK">
<title>Struts Simple Calc</title>
</head>
<body>
	<h1>Struts ¼òµ¥¼ÆËãÆ÷</h1>
	<form action="calc.do" method="post">
		<input type="text" name="value1" />
		<select name="flag">
			<option value="+">+</option>
			<option value="-">¡ª</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select>
		<input type="text" name="value2" />
		<input type="submit" value="¼ÆËã" />
	</form>
</body>
</html>