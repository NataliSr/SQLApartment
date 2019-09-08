package com.gmail.natali.model;

public class Apartment {
    private int id;
    private String district;
    private String address;
    private int area;
    private int numberOfRooms;
    private int price;

    public Apartment(int id, String district, String address, int area, int numberOfRooms, int price) {
        this.id = id;
        this.district = district;
        this.address = address;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    public Apartment() {
    }

    public Apartment(String district, String address, int area, int numberOfRooms, int price) {
        this.district = district;
        this.address = address;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", numberOfRooms=" + numberOfRooms +
                ", price=" + price +
                '}';
    }
}
