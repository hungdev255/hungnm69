package com.parking.repository;

import com.parking.entities.Parkinglot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkinglotRepository extends JpaRepository<Parkinglot, Integer> {


    List<Parkinglot> findByParkNameContains(String name);

    Parkinglot findByParkId(Integer id);
}
