1、配置struts
	* 拷贝struts相关的jar到WEB-INF/lib下
	* 在Web.xml文件中配置ActionServlet
	* 提供struts-config.xml文件，需要放置入WEB-INF下
	
第一个项目
1、建立login.jsp/login_success.jsp/login_error.jsp
2、建立了LoginAction.java/LoginActionForm.java
3、将LoginAction/LoginActionForm相关jsp配置到Struts-config.xml文件中

ActionForward的使用
1、了解redirect属性
2、了解全局和局部ActionForward
3、了解放到WEB/INF下的资源是安全的，可以将jsp放到WEB-INF下，以后只要控制Action就可以了。
4、Struts的配置文件不允许在运行期修改。
5、了解手动控制转向，必须返回null给struts框架，而不是ActionForward对象。
6、了解动态的ActionForward，动态的ActionForward可以运行期修改。