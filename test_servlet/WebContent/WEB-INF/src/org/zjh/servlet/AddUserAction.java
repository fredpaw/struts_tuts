package org.zjh.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUserAction implements IAction {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String username = req.getParameter("username");
		//int age = Integer.parseInt(req.getParameter("age"));
		//String gender = req.getParameter("gender");
		//...
		
		//调用业务逻辑
		UserManager userManager = new UserManager();
		try {
			userManager.add(username);
		}catch(Exception e){
			return "/add_error.jsp";
		}
		return "/add_success.jsp";
	}

}
