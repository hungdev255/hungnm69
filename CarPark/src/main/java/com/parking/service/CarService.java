package com.parking.service;

import com.parking.entities.Car;
import com.parking.entities.Parkinglot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CarService {

    Page<Car> getAll(Pageable pageable);

    List<Car> getByParkinglot(Integer id);


    List<Car> getByParkinglotName(String name);

    Car add(Car car, Parkinglot parkinglot);

    Car findByLicensePlate(String licensePlate);



}
