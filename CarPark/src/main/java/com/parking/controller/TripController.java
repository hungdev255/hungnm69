package com.parking.controller;

import com.parking.entities.Trip;
import com.parking.service.TripService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }


    @GetMapping("/findAll")
    public List<Trip> findAll(){
        return tripService.findAll();
    }

    @GetMapping("findByID/{id}")
    public Trip findByID(@PathVariable Integer id){
        return tripService.findByID(id);
    }

    @PostMapping("/add")
    public Trip add (@RequestBody Trip trip){
        return tripService.add(trip);
    }
}
