package org.zjh.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class MustLoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if(request.getSession().getAttribute("username") == null){
			ActionForward af = mapping.findForward("login");
			
			//Struts无法动态修改配置文件。
			//af.setRedirect(false);
			return af;
			
			//手动转向
			//response.sendRedirect(request.getContextPath() + "/login.jsp");
			
			//return null;
		}
		// return null进行手动转向。
		return mapping.findForward("success");
	}

}
