package com.parking.service.impl;

import com.parking.entities.BookingOffice;
import com.parking.repository.BookingOfficeRepository;
import com.parking.repository.TripRepository;
import com.parking.service.BookingOfficeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookingOfficeImpl implements BookingOfficeService {

    private final BookingOfficeRepository bookingOfficeRepository;
    private final TripRepository tripRepository;

    public BookingOfficeImpl(BookingOfficeRepository bookingOfficeRepository, TripRepository tripRepository) {
        this.bookingOfficeRepository = bookingOfficeRepository;
        this.tripRepository = tripRepository;
    }


    @Override
    public List<BookingOffice> getAll() {
        return bookingOfficeRepository.findAll();
    }

    @Override
    public Optional<BookingOffice> getBookingOfficeById(Integer id) {
        return bookingOfficeRepository.findById(id);
    }

    @Override
    public List<BookingOffice> getBookingOfficeByName(String name) {
        return bookingOfficeRepository.findBookingOfficeByOfficeName(name);
    }

    @Override
    public BookingOffice addBookingOffice(String string) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        BookingOfficeRequestDTO bookingOfficeRequestDTO = objectMapper.readValue(string, BookingOfficeRequestDTO.class);
//
//        Trip trip = tripRepo.findByTripId(bookingOfficeRequestDTO.getTripId());
//
//        if (trip != null) {
            BookingOffice bookingOffice = new BookingOffice();
//            bookingOffice.setTrip(trip);
//            bookingOffice.setStartContractDeadline(bookingOfficeRequestDTO.getStartContractDeadline());
//            bookingOffice.setOfficeId(bookingOfficeRequestDTO.getOfficeId());
//            bookingOffice.setOfficePlace(bookingOfficeRequestDTO.getOfficePlace());
//            bookingOffice.setOfficePhone(bookingOfficeRequestDTO.getOfficePhone());
//            bookingOffice.setEndContractDeadline(bookingOfficeRequestDTO.getEndContractDeadline());
//            bookingOffice.setOfficePrice(bookingOfficeRequestDTO.getOfficePrice());
//            bookingOffice.setOfficeName(bookingOfficeRequestDTO.getOfficeName());
//
//
            return bookingOfficeRepository.save(bookingOffice);
//
//        }
//        else{
//            throw new IllegalArgumentException("Trip id not exist");
//        }
    }

    @Override
    public void deleteById(Integer id) {
        bookingOfficeRepository.deleteByOfficeId(id);
    }
}
