package com.gmail.natali.service.dao;

import com.gmail.natali.model.Apartment;

import java.sql.SQLException;
import java.util.List;

public class ApartmentService {
    private ApatmentDAO apatmentDAO;

    public ApartmentService(ApatmentDAO apatmentDAO) {
        this.apatmentDAO = apatmentDAO;
    }

    public ApatmentDAO getApatmentDAO() {
        return apatmentDAO;
    }

    public void setApatmentDAO(ApatmentDAO apatmentDAO) {
        this.apatmentDAO = apatmentDAO;
    }

    public void addApartment(Apartment apartment) throws SQLException {
        apatmentDAO.addApartment(apartment);
    }

    public List<Apartment> getAllApartment()throws SQLException{
        return apatmentDAO.getAllApartment();
    }
    public void delApartment(int id)throws SQLException{
        apatmentDAO.delApartment(id);
    }
    public List<Apartment> findbyPrice (int with, int to)throws SQLException{
return apatmentDAO.findbyPrice(with,to);
    }

}
