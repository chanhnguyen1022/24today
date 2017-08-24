/**
 *@author chanh-nm,
 * @(#)Connect database .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 * Version 1.1.a
 */
package Edit;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import search.CustomerDAO;

public class RedirectEditAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CustomerDAO dao=new CustomerDAO();
    int id = Integer.parseInt(request.getParameter("id"));
		EditForm editForm = dao.getEditForm(id);
    request.setAttribute("editform",editForm);
    request.setAttribute("action","processEdit.do");
		return mapping.findForward("edit");

	}
}
