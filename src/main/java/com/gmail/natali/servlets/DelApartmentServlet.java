package com.gmail.natali.servlets;

import com.gmail.natali.controller.ApartmentController;
import com.gmail.natali.model.Apartment;
import com.gmail.natali.service.dao.SQLApartmetDAOImplementation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DelApartmentServlet extends HttpServlet {
    private ApartmentController ap;

    @Override
    public void init() throws ServletException {
        super.init();
        ap = new ApartmentController(new SQLApartmetDAOImplementation());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        ap.delApartment(id);
        resp.sendRedirect("/index.jsp");
    }
}
