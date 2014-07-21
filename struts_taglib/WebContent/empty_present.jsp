<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>
	<h1>测试Logic:empty,logic:notEmpty,logic:present,logic:notPresent</h1>
	<hr>
	<logic:empty name="attr1">
		 attr1为空
	</logic:empty>
	<logic:notEmpty name="attr1">
		attr1不为空
	</logic:notEmpty>
	<logic:present name="attr1">
		attr1存在
	</logic:present>
	<logic:notPresent name="attr1">
		attr1不存在
	</logic:notPresent>
	<logic:empty name="attr2">
		 attr2为空
	</logic:empty>
	<logic:notEmpty name="attr2">
		attr2不为空
	</logic:notEmpty>
	<logic:present name="attr2">
		attr2存在
	</logic:present>
	<logic:notPresent name="attr2">
		attr2不存在
	</logic:notPresent>
	<logic:empty name="attr3">
		 attr3为空
	</logic:empty>
	<logic:notEmpty name="attr3">
		attr3不为空
	</logic:notEmpty>
	<logic:present name="attr3">
		attr3存在
	</logic:present>
	<logic:notPresent name="attr3">
		attr3不存在
	</logic:notPresent>
</body>
</html>