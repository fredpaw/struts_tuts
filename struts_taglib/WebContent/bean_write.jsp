<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Bean Write Test</title>
</head>
<body>
	<h1>Bean Write Test</h1>
	<hr>
	<h3>普通字符串</h3>
	<p>Hello(标签):<bean:write name="hello" /></p>
	<h3>HTML文本</h3>
	<p>bj:default:<bean:write name="bj"/> </p>
	<p>bj:default(filter="true"):<bean:write name="bj" filter="true"/> </p>
	<p>bj:default(filter="false"):<bean:write name="bj" filter="false"/> </p>
	<h3>格式化日期</h3>
	<p>today(default):<bean:write name="today" /></p>
	<p>today(format="YYYY-MM-dd HH:mm:ss"):<bean:write name="today" format="YYYY-MM-dd HH:mm:ss" /></p>
	<h3>格式化数字</h3>
	<p>Number(default):<bean:write name="n" /></p>
	<p>Number(format="###,###.##"):<bean:write name="n" format="###,###.##" /></p>
	<p>Number(format="###,###.00000"):<bean:write name="n" format="###,###.00000" /></p>
	<h3>对象结构</h3>
	<p>姓名:<bean:write name="user" property="username" /></p>
	<p>年龄:<bean:write name="user" property="age" /></p>
	<p>所属组:<bean:write name="user" property="group.name" /></p>
</body>
</body>
</html>