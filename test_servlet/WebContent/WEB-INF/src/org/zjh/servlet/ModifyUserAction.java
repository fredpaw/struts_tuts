package org.zjh.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModifyUserAction implements IAction {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String username = req.getParameter("username");
		//其他修改条件
		
		//调用业务逻辑
		UserManager userManager = new UserManager();
		try{
			userManager.modify(username);
		} catch (Exception e){
			return "/modify_error.jsp";
		}
		return "/modify_success.jsp";
	}

}
