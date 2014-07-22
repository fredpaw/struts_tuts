package org.zjh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestURI = req.getRequestURI();
		String path = requestURI.substring(requestURI.indexOf("/",1),requestURI.indexOf("."));
		/*
		String username = req.getParameter("username");
		UserManager userManager = new UserManager();
		String forward = "";
		if("/addUser".equals(path)){
			userManager.add(username);
			forward = "add_success.jsp";
		} else if("/delUser".equals(path)){
			userManager.del(username);
			forward = "del_success.jsp";
		} else if("/modifyUser".equals(path)){
			userManager.modify(username);
			forward = "modify_success.jsp";
		} else if("/queryUser".equals(path)){
			List userList = userManager.query(username);
			forward = "query_success.jsp";
			req.setAttribute("userList",userList);
		} else {
			throw new RuntimeException("请求失败");
		}
		req.getRequestDispatcher(forward).forward(req, resp);
		*/
		IAction iAction = null;
		if("/addUser".equals(path)){
			iAction = new AddUserAction();
		} else if("/delUser".equals(path)){
			iAction = new DelUserAction();
		} else if("/modifyUser".equals(path)){
			iAction = new ModifyUserAction();
		} else if("/queryUser".equals(path)){
			iAction = new QueryUserAction();
		} else {
			throw new RuntimeException("请求失败");
		}
		String forward = null;
		try {
			forward = iAction.execute(req,resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher(forward).forward(req, resp);
		
		/**
		 * <action-config>
		 *   <action path="/delUser" type="org.zjh.servlet.DelUserAction">
		 *     <forward name="success">/del_success.jsp</forward>
		 *     <forward name="error">/del_error.jsp</forward>
		 *   </action>
		 *   <action path="/addUser" type="org.zjh.servlet.AddUserAction">
		 *     <forward name="success">/add_success.jsp</forward>
		 *     <forward name="error">/add_error.jsp</forward>
		 *   </action>
		 *   <action path="/modifyUser" type="org.zjh.servlet.ModifyUserAction">
		 *     <forward name="success">/modify_success.jsp</forward>
		 *     <forward name="error">/modify_error.jsp</forward>
		 *   </action>
		 *   <action path="/queryUser" type="org.zjh.servlet.QueryUserAction">
		 *     <forward name="success">/query_success.jsp</forward>
		 *     <forward name="error">/query_error.jsp</forward>
		 *   </action>
		 * </action-config>
		 * 
		 * ActionMapping {
		 * 		private String path;
		 * 		private String type;
		 * 		Map forwardMap;
		 * 		
		 * }
		 * 
		 * forwardMap {
		 * 		key="success";
		 * 		value="/add_success.jsp"
		 * 		key="error"
		 * 		value="/add_error.jsp"
		 * }
		 * 
		 * Map map = new HashMap();
		 * map.put("/delUser", actionMapping);
		 * map.put("/addUser", actionMapping);
		 * map.put("/modifyUser", actionMapping);
		 * map.put("/queryUser", actionMapping);
		 * 
		 * 如果是删除AcitonMapping存储如下：
		 * actionMapping{
		 * 	path="/delUser";
		 * 	type="org.zjh.servlet.DelUserAction";
		 * 	forwardMap(){
		 * 		key="success" value="/del_success.jsp";
		 * 		key="error" value="/del_error.jsp";
		 * 	}
		 * }
		 * 
		 * String path="/delUser";
		 * 
		 * 根据截取的URL请求，到Map中取得本次请求对应的Action。
		 * ActionMapping actionMapping = (ActionMapping)map.get(path);
		 * 
		 * 取得本次请求对应的Action类的完整路径
		 * String type = actionMapping.getType(); //org.zjh.servlet.DelUserAction
		 * 
		 * 采用反射动态实例化Action
		 * Action action = (Action)class.forName(type).newInstance();
		 * 
		 * 动态调用Action中的execute方法
		 * String forward = action.execute(request.response);
		 * 
		 * 根据路径完成转向
		 * req.getRequestDispatcher(forward).forward(req, resp);
		 * 
		 */
	}

}
