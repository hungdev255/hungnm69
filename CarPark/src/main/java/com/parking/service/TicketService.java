package com.parking.service;

import com.parking.entities.Ticket;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface TicketService {

    List<Ticket> findAll();

    List<Ticket> findByTripID(Integer id);

    Ticket findByID(Integer id);

    Ticket add(String string) throws JsonProcessingException;

}
