package org.zjh.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CalAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CalActionForm calForm = (CalActionForm) form;
		double value1 = calForm.getValue1();
		double value2 = calForm.getValue2();
		String flag = calForm.getFlag();
		double result = 0.0;
		try {
			if("+".equals(flag)){
				result = value1 + value2;
			} else if("-".equals(flag)){
				result = value1 - value2;
			} else if("*".equals(flag)){
				result = value1 * value2;
			} else if("/".equals(flag)){
				result = value1 / value2;
			}
			request.setAttribute("result", result);
			return mapping.findForward("success");
		} catch (Exception e){
			e.printStackTrace();
			return mapping.findForward("error");
		}
	}
}
