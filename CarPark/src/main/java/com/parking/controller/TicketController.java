package com.parking.controller;


import com.parking.entities.Ticket;
import com.parking.service.CarService;
import com.parking.service.TicketService;
import com.parking.service.TripService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService ticketService;
    private final TripService tripService;
    private final CarService carService;

    public TicketController(TicketService ticketService, TripService tripService, CarService carService) {
        this.ticketService = ticketService;
        this.tripService = tripService;
        this.carService = carService;
    }


    @GetMapping("/findAll")
    public List<Ticket> findAll(){
        return ticketService.findAll();
    }

    @GetMapping("/findByTripID/{id}")
    public List<Ticket> findByTripID(@PathVariable Integer id){
        return ticketService.findByTripID(id);
    }

    @GetMapping("/findByID/{id}")
    public Ticket findByID(@PathVariable Integer id){
        return ticketService.findByID(id);
    }

    @PostMapping("/add")
    public Ticket add(@RequestBody String string) throws JsonProcessingException {

        return ticketService.add(string);
    }
}
