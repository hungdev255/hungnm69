package com.parking.repository;

import com.parking.entities.BookingOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookingOfficeRepository extends JpaRepository<BookingOffice, Integer> {

    BookingOffice findByOfficeId(Integer id);

    List<BookingOffice> findAll();

    List<BookingOffice> findBookingOfficeByOfficeName(String name);

    void deleteByOfficeId(Integer id);


}
