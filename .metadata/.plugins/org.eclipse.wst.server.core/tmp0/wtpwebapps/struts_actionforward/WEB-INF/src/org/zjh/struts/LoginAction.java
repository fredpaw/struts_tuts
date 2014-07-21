package org.zjh.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 登录Action
 * 负责取得表单数据，调用业务逻辑，返回转向信息
 * 
 * @author Fred
 *
 */
public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
/**		LoginActionForm laf = (LoginActionForm) form;
		String username = laf.getUsername();
		String password = laf.getPassword();
		if ("admin".equals(username) && "admin".equals(password)){
			//登录成功
			return mapping.findForward("success");
		} else {
			//登录失败
			return mapping.findForward("error");
		}
*/		
		LoginActionForm laf = (LoginActionForm) form;
		String username = laf.getUsername();
		String password = laf.getPassword();
		
		UserManager userManager = new UserManager();
		try {
			userManager.login(username,password);
			request.getSession().setAttribute("username",username);
			return mapping.findForward("success");
		} catch (UserNotFoundException e1){
			e1.printStackTrace();
			request.setAttribute("msg", "用户不存在");
		} catch (PasswordErrorException e2){
			e2.printStackTrace();
			request.setAttribute("msg", "密码错误");
		}
		return mapping.findForward("error");
 	}

}
