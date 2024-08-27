package com.example.demo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.example.demo.form.LoginForm;
import com.example.demo.service.LoginService;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		LoginForm loginForm = (LoginForm) form;
		LoginService loginService = new LoginService();

		if (loginForm.getUserName() == null || loginForm.getPassword() == null
				|| loginService.searchUser(loginForm.getUserName()) == null) {
			return mapping.findForward("failure");
		} else {
			return mapping.findForward("success");
		}

	}

}
