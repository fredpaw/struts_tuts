<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>User Manager</title>
</head>
<body>
	<form action="addUser.do" method="post">
		<label>��ӳ�Ա</label>
		������<input type="text" name="username" />
		<input type="submit" value="Submit" />
	</form><br>
	<form action="delUser.do" method="post">
		<label>ɾ����Ա</label>
		������<input type="text" name="username" />
		<input type="submit" value="Submit" />
	</form><br>
	<form action="modifyUser.do" method="post">
		<label>�޸ĳ�Ա</label>
		������<input type="text" name="username" />
		<input type="submit" value="Submit" />
	</form><br>
	<form action="queryUser.do" method="post">
		<label>��ѯ��Ա</label>
		������<input type="text" name="username" />
		<input type="submit" value="Submit" />
	</form>
</body>
</html>