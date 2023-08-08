package com.digit.hibernate.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.hibernate.servlet.model.HibernateManager;
import com.digti.hibernate.servlet.bean.AadharDetails;

@WebServlet("/Delete")
public class Delete extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		AadharDetails ad=new AadharDetails();
		int id=Integer.parseInt(req.getParameter("id"));
		HibernateManager hb=new HibernateManager();
		if(hb.delete(id)){
			resp.sendRedirect("/Servlet_Hibernate/DeleteSuccess.html");
		}
		else {
			resp.sendRedirect("/Servlet_Hibernate/DeleteFail.html");
		}
	}
}

