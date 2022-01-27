package com.parking.service;


import com.parking.entities.Parkinglot;

import java.util.List;

public interface ParkinglotService {

    List<Parkinglot> getAll();

    List<Parkinglot> searchByName(String name);

    String addParkinglot(Parkinglot parkinglot);


}
