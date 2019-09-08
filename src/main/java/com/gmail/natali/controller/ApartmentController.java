package com.gmail.natali.controller;

import com.gmail.natali.model.Apartment;
import com.gmail.natali.service.dao.ApatmentDAO;

import java.sql.SQLException;
import java.util.List;

public class ApartmentController {
    private ApatmentDAO apatmentDAO;

    public ApartmentController(ApatmentDAO apatmentDAO) {
        this.apatmentDAO = apatmentDAO;
    }

    public void addApartment(Apartment apartment) {
        try {
            apatmentDAO.addApartment(apartment);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Apartment> getAllApartment() {
        try {
            return apatmentDAO.getAllApartment();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void delApartment(int id) {
        try {
            apatmentDAO.delApartment(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Apartment> findbyPrice(int with, int to) {
        try {
            return apatmentDAO.findbyPrice(with, to);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
