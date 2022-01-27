package com.parking.repository;

import com.parking.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip, Integer> {

    Trip findByTripId(Integer id);
}
