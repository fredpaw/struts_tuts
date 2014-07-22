package org.zjh.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IAction {
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
