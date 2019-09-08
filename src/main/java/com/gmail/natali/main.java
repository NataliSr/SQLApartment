package com.gmail.natali;

import com.gmail.natali.controller.ApartmentController;
import com.gmail.natali.model.Apartment;
import com.gmail.natali.service.dao.SQLApartmetDAOImplementation;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Apartment apartment = new Apartment("Obolon", "Tymoshenko 35", 49, 2, 45000);
        Apartment apartment2 = new Apartment("Obolon", "Tymoshenko 38", 55, 3, 65000);

        ApartmentController ap = new ApartmentController(new SQLApartmetDAOImplementation());
//        ap.addApartment(apartment);
//        ap.addApartment(apartment2);
//        List<Apartment> apartments = ap.getAllApartment();
//        for (Apartment apartment1 : apartments) {
//            System.out.println(apartment1);
//        }

  //      ap.delApartment(4);

        List<Apartment> apartments = ap.findbyPrice(45000, 45000);
        for (Apartment apartment1 : apartments) {
            System.out.println(apartment1);
        }

    }
}
