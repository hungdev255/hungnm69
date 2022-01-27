package com.parking.service;

import com.parking.entities.Trip;

import java.util.List;

public interface TripService {



    List<Trip> findAll();

    Trip findByID(Integer id);

    Trip add(Trip trip);


}
