1、动态ActionForm
	动态ActionForm可以减少静态ActionForm的数量，使用动态ActionForm完全可以获得静态ActionForm所有的功能。
	* 在struts-config.xml文件中定义动态ActionForm，如：
	<form-beans>
		<form-bean name="dynaForm" type="org.apache.struts.action.DynaActionForm">
			<form-property name="username" type="java.lang.String"/>
			<form-property name="age" type="java.lang.Integer"/>
		</form-bean>
	</form-beans>
	* 在Action中使用动态ActionForm，参见DynaActionFormTestAction.java
		DynaActionForm daf = (DynaActionForm) form;
		String username = (String) daf.get("username");
		Integer age = (Integer) daf.get("age");
	
	动态ActionForm其实是指把页面中的Html元素的名字和值放到了Map中，所以通过get方法可以去除相应的值
	动态ActionForm采用EL表达式的输出方式，${dynaForm.map.username }，参见：dyna_actionform.jsp
	动态Action的验证，通常使用动态验证框架validator
	
2、采用struts上传文件
	* 页面的配置，如：
	<form action="upload.do" method="post" enctype="multipart/form-data">
		<label>测试Struts上传</label><br>
		标题：<input type="text" name="title"><br>
		文件：<input type="file" name="myfile"><br>
		<input type="submit" value="Submit"><br>
	</form>
	* ActionForm中使用FormFile来接受上传的文件，参见：UploadActionForm.java
	* 在Action中使用Formfile取得上传文件的数据，采用流输出，即完成上传，参见：UploadTestAction.java
	* 采用<controller/>标签配置上传参数，如：<controller maxFileSize="10M"/>
	
3、测试Actionform类型的自动转换
	* boolean：yes，1，on，true都会转换成True类型，而且忽略大小写，其他情况转换成false；
	* Date类型的转换：
		* 如果是java.sql.Date，页面日期的格式必须为yyyy-mm-dd，才可以转换
		* 如果是java.util.Date，默认情况下Struts无法转换
		
	* 自定义转换器的实现步骤
		* 实现converter接口，实现convert方法
		* 将实现的converter注册，通常情况下采用servlet注册，配置Servlet，并重写init()方法，使其在服务器启动的时候运行。
			public void init() throws ServletException{
				ConvertUtils.register(new UtilDateConverter(), java.util.Date.class);
			}
		* 采用servlet注册需要注意在web.xml中进行servlet标签的配置：<load-on-startup>10</load-on-startup>
		（也可以采用struts.plugin注册）
		
Struts对ActionForm的自动搜集过程：
	* 将页面数据放到map中，其中map中的key为页面中的名称，map中的value为页面中的value值。
	* 调用BeanUtils.setProperties方法，将map中的值逐个设置到ActionForm实例上，对于ActionForm中的每个属性根据类型调用相应的Converter,然后调用相应的convert()方法，将相应的字符串转换成AcitonForm中指定的类型。