package org.zjh.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DelUserAction implements IAction {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String username = req.getParameter("username");
		//其他删除条件
		
		//调用业务逻辑
		UserManager userManager = new UserManager();
		try {
			userManager.del(username);
		}catch(Exception e){
			return "del.error.jsp";	//转向路径都通过配置路径读取。
		}
		return "/del_success.jsp";
	}
}
