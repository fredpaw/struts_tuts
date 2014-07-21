package org.zjh.struts;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class UploadTestAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UploadActionForm uaf = (UploadActionForm) form;
		String title = uaf.getTitle();
		FileOutputStream fos = new FileOutputStream("F:\\" + uaf.getMyfile().getFileName());
		fos.write(uaf.getMyfile().getFileData());
		fos.flush();
		fos.close();
		return mapping.findForward("success");
	}

}
