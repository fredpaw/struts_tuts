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
	<h1>����Logic:empty,logic:notEmpty,logic:present,logic:notPresent</h1>
	<hr>
	<logic:empty name="attr1">
		 attr1Ϊ��
	</logic:empty>
	<logic:notEmpty name="attr1">
		attr1��Ϊ��
	</logic:notEmpty>
	<logic:present name="attr1">
		attr1����
	</logic:present>
	<logic:notPresent name="attr1">
		attr1������
	</logic:notPresent>
	<logic:empty name="attr2">
		 attr2Ϊ��
	</logic:empty>
	<logic:notEmpty name="attr2">
		attr2��Ϊ��
	</logic:notEmpty>
	<logic:present name="attr2">
		attr2����
	</logic:present>
	<logic:notPresent name="attr2">
		attr2������
	</logic:notPresent>
	<logic:empty name="attr3">
		 attr3Ϊ��
	</logic:empty>
	<logic:notEmpty name="attr3">
		attr3��Ϊ��
	</logic:notEmpty>
	<logic:present name="attr3">
		attr3����
	</logic:present>
	<logic:notPresent name="attr3">
		attr3������
	</logic:notPresent>
</body>
</html>