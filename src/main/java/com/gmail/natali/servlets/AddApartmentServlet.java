package com.gmail.natali.servlets;

import com.gmail.natali.controller.ApartmentController;
import com.gmail.natali.model.Apartment;
import com.gmail.natali.service.dao.SQLApartmetDAOImplementation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddApartmentServlet extends HttpServlet {
    private ApartmentController ap;

    @Override
    public void init() throws ServletException {
        super.init();
        ap = new ApartmentController(new SQLApartmetDAOImplementation());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String district = req.getParameter("district");
        String address = req.getParameter("address");
        int area = Integer.parseInt(req.getParameter("area"));
        int numberOfRooms = Integer.parseInt(req.getParameter("numberOfRooms"));
        int price = Integer.parseInt(req.getParameter("price"));

        Apartment apartment = new Apartment(district, address, area, numberOfRooms, price);
        ap.addApartment(apartment);
    }
}
