package com.parking.controller;

import com.parking.entities.Car;
import com.parking.entities.Parkinglot;
import com.parking.service.CarService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/findAll")
    public Page<Car> findAll(Pageable pageable){

        return carService.getAll(pageable);
    }

    @GetMapping("/findByParkinglotId/{id}")
    public List<Car> findByParkinglotID(@PathVariable Integer id){
        return carService.getByParkinglot(id);
    }

    @GetMapping("/findByParkinglotName/")
    public List<Car> findByParkinglotName(@RequestParam String name){
        return carService.getByParkinglotName(name);
    }

    @PostMapping("/add/{parkinglotID}")
    public Car add(@RequestBody Car car, @PathVariable Parkinglot parkinglotID){

        return carService.add(car,parkinglotID);
    }
}
