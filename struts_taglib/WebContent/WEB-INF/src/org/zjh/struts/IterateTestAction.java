package org.zjh.struts;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class IterateTestAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Group group = new Group();
		group.setName("动力");
		
		List userList = new ArrayList();
		
		for(int i=0; i<10; i++){
			User user = new User();
			user.setUsername("张三" + i);
			user.setAge(22 + i);
			user.setGroup(group);
			
			userList.add(user);
		}
		request.setAttribute("user_list",userList);
		return mapping.findForward("success");
	}

}
