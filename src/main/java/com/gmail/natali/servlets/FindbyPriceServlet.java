package com.gmail.natali.servlets;

import com.gmail.natali.controller.ApartmentController;
import com.gmail.natali.model.Apartment;
import com.gmail.natali.service.dao.SQLApartmetDAOImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FindbyPriceServlet extends HttpServlet {
    private ApartmentController ap;

    @Override
    public void init() throws ServletException {
        super.init();
        ap = new ApartmentController(new SQLApartmetDAOImplementation());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int with = Integer.parseInt(req.getParameter("with"));
        int to = Integer.parseInt(req.getParameter("to"));
        List<Apartment> apartments = ap.findbyPrice(with, to);
        req.setAttribute("apartmentsByPrice", apartments);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/apartments_by_price.jsp");
        rd.forward(req, resp);
    }
}
