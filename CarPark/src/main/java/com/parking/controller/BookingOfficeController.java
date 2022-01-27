package com.parking.controller;

import com.parking.entities.BookingOffice;
import com.parking.service.BookingOfficeService;
import com.parking.service.TripService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bookingOffice")
public class BookingOfficeController {

    private final BookingOfficeService bookingOfficeService;
    private final TripService tripService;


    public BookingOfficeController(BookingOfficeService bookingOfficeService, TripService tripService) {
        this.bookingOfficeService = bookingOfficeService;
        this.tripService = tripService;
    }


        @GetMapping("/findAll")
    public List<BookingOffice> getAll(){
        return bookingOfficeService.getAll();
    }

    @PostMapping("/add")
    public BookingOffice add(@RequestBody String string) throws JsonProcessingException {

        return bookingOfficeService.addBookingOffice(string);
    }

    @GetMapping("/findByID/{id}")
    public Optional<BookingOffice> getByID(@PathVariable Integer id){
        return bookingOfficeService.getBookingOfficeById(id);
    }
}
