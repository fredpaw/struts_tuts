package org.zjh.struts;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class BeanWriteTestAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		//普通字符串
		request.setAttribute("hello", "helloworld");
		
		//HTML文本
		request.setAttribute("bj", "<font color='red'>北京欢迎你</font>");
		
		//日期
		request.setAttribute("today",new Date());
		
		//数字
		request.setAttribute("n",12345.1234);
		
		//对象结构
		Group group = new Group();
		group.setName("动力");
		User user = new User();
		user.setUsername("张三");
		user.setAge(30);
		user.setGroup(group);
		request.setAttribute("user",user);
		
		return mapping.findForward("success");
		
	}

}
