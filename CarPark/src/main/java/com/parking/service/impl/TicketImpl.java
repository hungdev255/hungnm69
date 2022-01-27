package com.parking.service.impl;

import com.parking.entities.Ticket;
import com.parking.repository.CarRepository;
import com.parking.repository.TicketRepository;
import com.parking.repository.TripRepository;
import com.parking.service.TicketService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final TripRepository tripRepository;
    private final CarRepository carRepository;

    public TicketImpl(TicketRepository ticketRepository, TripRepository tripRepository, CarRepository carRepository) {
        this.ticketRepository = ticketRepository;
        this.tripRepository = tripRepository;
        this.carRepository = carRepository;
    }


    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAllTicketDTO();
    }

    @Override
    public List<Ticket> findByTripID(Integer id) {
        return ticketRepository.findByTripId(id);
    }

    @Override
    public Ticket findByID(Integer id) {
        return ticketRepository.findByTicketId(id);
    }

    @Override
    public Ticket add(String string) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        TicketRequestDTO ticket  = mapper.readValue(string, TicketRequestDTO.class);
        Ticket ticket1 = new Ticket();
//
//        Trip tripId =  tripRepo.findByTripId(ticket.getTripId());
//
//        if(tripId!=null) {
//            ticket1.setTrip(tripId);
//
//            Car licensePlate = carRepo.findByLicensePlate(ticket.getLicensePlate());
//
//            ticket1.setBookingTime(ticket.getBookingTime());
//            ticket1.setCustomerName(ticket.getCustomerName());
//            ticket1.setCar(licensePlate);
//            ticket1.setTrip(tripId);
            return ticketRepository.save(ticket1);
//        }
//        else{
//            throw new IllegalArgumentException("Trip ID not exist");
//        }
    }
}
