package org.zjh.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DelUserAction implements IAction {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String username = req.getParameter("username");
		//����ɾ������
		
		//����ҵ���߼�
		UserManager userManager = new UserManager();
		try {
			userManager.del(username);
		}catch(Exception e){
			return "del.error.jsp";	//ת��·����ͨ������·����ȡ��
		}
		return "/del_success.jsp";
	}
}
