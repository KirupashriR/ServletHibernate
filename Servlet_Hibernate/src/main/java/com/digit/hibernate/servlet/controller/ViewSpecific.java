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
@WebServlet("/ViewSpecific")
public class ViewSpecific extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        AadharDetails ad = new AadharDetails();
        HibernateManager hbm = new HibernateManager();

        AadharDetails curAd = hbm.readSpecific(id);
        if (curAd == null) {
            resp.sendRedirect("ViewDetailsFail.html");
            return;
        }
        HttpSession session = req.getSession();
        session.setAttribute("curUser", curAd);
        resp.sendRedirect("ViewEnrollerDetails.jsp");
        return;
    }
}