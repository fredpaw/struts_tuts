package org.zjh.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QueryUserAction implements IAction {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String username = req.getParameter("username");
		//������ѯ����
		
		//����ҵ���߼�
		UserManager userManager = new UserManager();
		try {
			List userList = userManager.query(username);
			req.setAttribute("userList", userList);
		}catch (Exception e){
			return "/modify_error.jsp";
		}
		return "/query_success.jsp";
	}

}
