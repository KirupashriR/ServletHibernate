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

@WebServlet("/Register")
public class Register extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(true);
		AadharDetails ad=new AadharDetails();
		ad.setId(Integer.parseInt(req.getParameter("id")));
		ad.setName(req.getParameter("name"));
		ad.setFname(req.getParameter("fname"));
		ad.setAge(Integer.parseInt(req.getParameter("age")));
		ad.setPhno(Integer.parseInt(req.getParameter("phno")));
		ad.setAddress(req.getParameter("address"));
		ad.setCity(req.getParameter("city"));
		ad.setState(req.getParameter("state"));
		ad.setPincode(Integer.parseInt(req.getParameter("pincode")));
		ad.setEmail(req.getParameter("email"));
		HibernateManager hb=new HibernateManager();
		if(hb.saveObj(ad)) {
			session.setAttribute("id",ad.getId());
			session.setAttribute("name",ad.getName());
			session.setAttribute("fname",ad.getFname());
			session.setAttribute("age",ad.getAge());
			session.setAttribute("phno",ad.getPhno());
			session.setAttribute("address",ad.getAddress());
			session.setAttribute("city",ad.getCity());
			session.setAttribute("state",ad.getState());
			session.setAttribute("pincode",ad.getPincode());
			session.setAttribute("email",ad.getEmail());
			resp.sendRedirect("/Servlet_Hibernate/RegisterSuccess.html");
		}
		else {
			resp.sendRedirect("/Servlet_Hibernate/RegisterFail.html");
		}
	}

}
