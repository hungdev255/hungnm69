package com.parking.service;

import com.parking.entities.BookingOffice;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.util.Optional;

public interface BookingOfficeService {

    List<BookingOffice> getAll();

    Optional<BookingOffice> getBookingOfficeById(Integer id);

    List<BookingOffice> getBookingOfficeByName(String name);

    BookingOffice addBookingOffice(String string) throws JsonProcessingException;

    void deleteById(Integer id);

}
