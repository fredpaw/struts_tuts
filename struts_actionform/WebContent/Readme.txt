1����̬ActionForm
	��̬ActionForm���Լ��پ�̬ActionForm��������ʹ�ö�̬ActionForm��ȫ���Ի�þ�̬ActionForm���еĹ��ܡ�
	* ��struts-config.xml�ļ��ж��嶯̬ActionForm���磺
	<form-beans>
		<form-bean name="dynaForm" type="org.apache.struts.action.DynaActionForm">
			<form-property name="username" type="java.lang.String"/>
			<form-property name="age" type="java.lang.Integer"/>
		</form-bean>
	</form-beans>
	* ��Action��ʹ�ö�̬ActionForm���μ�DynaActionFormTestAction.java
		DynaActionForm daf = (DynaActionForm) form;
		String username = (String) daf.get("username");
		Integer age = (Integer) daf.get("age");
	
	��̬ActionForm��ʵ��ָ��ҳ���е�HtmlԪ�ص����ֺ�ֵ�ŵ���Map�У�����ͨ��get��������ȥ����Ӧ��ֵ
	��̬ActionForm����EL���ʽ�������ʽ��${dynaForm.map.username }���μ���dyna_actionform.jsp
	��̬Action����֤��ͨ��ʹ�ö�̬��֤���validator
	
2������struts�ϴ��ļ�
	* ҳ������ã��磺
	<form action="upload.do" method="post" enctype="multipart/form-data">
		<label>����Struts�ϴ�</label><br>
		���⣺<input type="text" name="title"><br>
		�ļ���<input type="file" name="myfile"><br>
		<input type="submit" value="Submit"><br>
	</form>
	* ActionForm��ʹ��FormFile�������ϴ����ļ����μ���UploadActionForm.java
	* ��Action��ʹ��Formfileȡ���ϴ��ļ������ݣ������������������ϴ����μ���UploadTestAction.java
	* ����<controller/>��ǩ�����ϴ��������磺<controller maxFileSize="10M"/>
	
3������Actionform���͵��Զ�ת��
	* boolean��yes��1��on��true����ת����True���ͣ����Һ��Դ�Сд���������ת����false��
	* Date���͵�ת����
		* �����java.sql.Date��ҳ�����ڵĸ�ʽ����Ϊyyyy-mm-dd���ſ���ת��
		* �����java.util.Date��Ĭ�������Struts�޷�ת��
		
	* �Զ���ת������ʵ�ֲ���
		* ʵ��converter�ӿڣ�ʵ��convert����
		* ��ʵ�ֵ�converterע�ᣬͨ������²���servletע�ᣬ����Servlet������дinit()������ʹ���ڷ�����������ʱ�����С�
			public void init() throws ServletException{
				ConvertUtils.register(new UtilDateConverter(), java.util.Date.class);
			}
		* ����servletע����Ҫע����web.xml�н���servlet��ǩ�����ã�<load-on-startup>10</load-on-startup>
		��Ҳ���Բ���struts.pluginע�ᣩ
		
Struts��ActionForm���Զ��Ѽ����̣�
	* ��ҳ�����ݷŵ�map�У�����map�е�keyΪҳ���е����ƣ�map�е�valueΪҳ���е�valueֵ��
	* ����BeanUtils.setProperties��������map�е�ֵ������õ�ActionFormʵ���ϣ�����ActionForm�е�ÿ�����Ը������͵�����Ӧ��Converter,Ȼ�������Ӧ��convert()����������Ӧ���ַ���ת����AcitonForm��ָ�������͡�