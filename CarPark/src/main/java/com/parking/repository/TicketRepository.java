package com.parking.repository;

import com.parking.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @Query(value="SELECT t.ticketId, t.bookingTime, t.customerName, " +
            "c.licensePlate, tr.tripId FROM Ticket t INNER JOIN Car c " +
            "ON c.licensePlate = t.car.licensePlate INNER JOIN Trip tr ON tr.tripId = t.trip.tripId" +
            " WHERE tr.tripId= :id")
    List<Ticket> findByTripId(@Param("id") Integer id);

    @Query( value="SELECT t.ticketId, t.bookingTime, t.customerName, " +
            "c.licensePlate, tr.tripId FROM Ticket t INNER JOIN Car c " +
            "ON c.licensePlate = t.car.licensePlate INNER JOIN Trip tr ON tr.tripId = t.trip.tripId" +
            " WHERE t.ticketId = ?1")
    Ticket findByTicketId(Integer id);


    @Query(value="SELECT t.ticketId, t.bookingTime, t.customerName, " +
            "c.licensePlate, tr.tripId FROM Ticket t INNER JOIN Car c " +
            "ON c.licensePlate = t.car.licensePlate INNER JOIN Trip tr ON tr.tripId = t.trip.tripId")
    List<Ticket> findAllTicketDTO();


}
