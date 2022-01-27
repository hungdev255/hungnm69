package com.parking.service.impl;


import com.parking.entities.Car;
import com.parking.entities.Parkinglot;
import com.parking.repository.CarRepository;
import com.parking.repository.ParkinglotRepository;
import com.parking.service.CarService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarImpl implements CarService {

    private final CarRepository carRepository;
    private final ParkinglotRepository parkinglotRepository;

    public CarImpl(CarRepository carRepository, ParkinglotRepository parkinglotRepository) {
        this.carRepository = carRepository;
        this.parkinglotRepository = parkinglotRepository;
    }

    @Override
    public Page<Car> getAll(Pageable pageable) {
        pageable = PageRequest.of(0,5);
        return carRepository.findAll(pageable);
    }

    @Override
    public List<Car> getByParkinglot(Integer id) {
        return carRepository.findByParkinglot_ParkId(id);
    }

    @Override
    public List<Car> getByParkinglotName(String name) {
        return carRepository.findByParkinglot_ParkName(name);
    }

    @Override
    public Car add(Car car, Parkinglot parkinglot) throws IllegalArgumentException{
        if(parkinglotRepository.findById(parkinglot.getParkId())==null){
            throw new IllegalArgumentException("parking lot ID not exist");
        }
        else {
            car.setParkinglot(parkinglot);
            return carRepository.save(car);
        }

    }

    @Override
    public Car findByLicensePlate(String licensePlate) {
        return carRepository.findByLicensePlate(licensePlate);
    }
}
