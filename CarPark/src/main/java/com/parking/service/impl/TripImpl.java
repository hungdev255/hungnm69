package com.parking.service.impl;

import com.parking.entities.Trip;
import com.parking.repository.TripRepository;
import com.parking.service.TripService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TripImpl implements TripService {

    private final TripRepository tripRepository;

    public TripImpl(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }


    @Override
    public List<Trip> findAll() {
        return tripRepository.findAll();
    }

    @Override
    public Trip findByID(Integer id) {
        return tripRepository.findByTripId(id);
    }

    @Override
    public Trip add(Trip trip) {
        return tripRepository.save(trip);
    }
}
