package com.gmail.natali.service.dao;

import com.gmail.natali.model.Apartment;

import java.sql.SQLException;
import java.util.List;

public interface ApatmentDAO {

public void addApartment(Apartment apartment) throws SQLException;
public List<Apartment> getAllApartment()throws SQLException;
public void delApartment(int id)throws SQLException;
public List<Apartment> findbyPrice (int with, int to)throws SQLException;
}
