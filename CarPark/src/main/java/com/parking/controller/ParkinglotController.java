package com.parking.controller;

import com.parking.entities.Parkinglot;
import com.parking.service.ParkinglotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkinglot")
public class ParkinglotController {

    private final ParkinglotService parkinglotService;

    public ParkinglotController(ParkinglotService parkinglotService) {
        this.parkinglotService = parkinglotService;
    }


    @GetMapping("/findAll")
    public List<Parkinglot> findAll(){
        return parkinglotService.getAll();
    }

    @PostMapping("/add")
    public Parkinglot add( @RequestBody Parkinglot parkinglot){
        parkinglotService.addParkinglot(parkinglot);
        return parkinglot;
    }

    @GetMapping("/findByName/{name}")
    public List<Parkinglot> findByName(@PathVariable String name){
        return parkinglotService.searchByName(name);
    }
}
