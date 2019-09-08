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

public class GetAllApartmentServlet extends HttpServlet {
    private ApartmentController ap;

    @Override
    public void init() throws ServletException {
        super.init();
        ap = new ApartmentController(new SQLApartmetDAOImplementation());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Apartment> apartments = ap.getAllApartment();
        req.setAttribute("apartments", apartments);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/all_apartments.jsp");
        rd.forward(req, resp);
    }
}
