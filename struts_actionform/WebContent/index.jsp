<%@ page language="java" contentType="text/html; GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; GBK">
<title>Struts ActionForm</title>
</head>
<body>
	<h1>Struts ActionForm</h1>
	<hr>
	<ul>
		<li>
			<form action="dyna_actionform.do" method="post">
				<label>测试动态ActionForm</label><br />
				姓名：<input type="text" name="username" /><br/>
				年龄：<input type="text" name="age" /><br />
				<input type="submit" value="Submit" />
			</form>
		</li>
		<li>
			<form action="upload.do" method="post" enctype="multipart/form-data">
				<label>测试Struts上传</label><br>
				标题：<input type="text" name="title"><br>
				文件：<input type="file" name="myfile"><br>
				<input type="submit" value="Submit"><br>
			</form>
		</li>
	</ul>
</body>
</html>