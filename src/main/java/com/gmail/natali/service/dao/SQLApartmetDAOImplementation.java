package com.gmail.natali.service.dao;

import com.gmail.natali.model.Apartment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLApartmetDAOImplementation implements ApatmentDAO {

    private final String DB_CONNECTION = "jdbc:mysql://localhost:3306/apartment?serverTimezone=Europe/Kiev";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "natalia123";

    public SQLApartmetDAOImplementation() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addApartment(Apartment apartment) throws SQLException {
        try (Connection cn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO apartment (district, address, area, numberOfRooms, price) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                ps.setString(1, apartment.getDistrict());
                ps.setString(2, apartment.getAddress());
                ps.setString(3, String.valueOf(apartment.getArea()));
                ps.setString(4, String.valueOf(apartment.getNumberOfRooms()));
                ps.setString(5, String.valueOf(apartment.getPrice()));
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<Apartment> getAllApartment() throws SQLException {
        List<Apartment> apartments = new ArrayList<>();
        try (Connection cn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD)) {
            try (PreparedStatement ps = cn.prepareStatement("select * from apartment")) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String district = rs.getString("district");
                    String address = rs.getString("address");
                    int area = rs.getInt("area");
                    int numberOfRooms = rs.getInt("numberOfRooms");
                    int price = rs.getInt("price");
                    Apartment apartment = new Apartment(id, district, address, area, numberOfRooms, price);
                    apartments.add(apartment);
                }
            }
        } catch (SQLException e) {
            throw e;
        }
        return apartments;
    }

    @Override
    public void delApartment(int id) throws SQLException {
        try (Connection cn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD)) {
            String sql = "DELETE FROM apartment WHERE id = " + id;
            try (Statement st = cn.createStatement()) {
                st.execute(sql);
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<Apartment> findbyPrice(int with, int to) throws SQLException {
        List<Apartment> apartments = new ArrayList<>();
        try (Connection cn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD)) {
            try (PreparedStatement ps = cn.prepareStatement("select * from apartment")) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String district = rs.getString("district");
                    String address = rs.getString("address");
                    int area = rs.getInt("area");
                    int numberOfRooms = rs.getInt("numberOfRooms");
                    int price = rs.getInt("price");
                    Apartment apartment = new Apartment(id, district, address, area, numberOfRooms, price);
                    if (price >= with && price <= to) {
                        apartments.add(apartment);
                    }
                }
            }
        } catch (SQLException e) {
            throw e;
        }
        return apartments;
    }
}
