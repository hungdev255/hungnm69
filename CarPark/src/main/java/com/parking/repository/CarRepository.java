package com.parking.repository;


import com.parking.entities.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CarRepository extends JpaRepository<Car, String> {

    @Query("SELECT c.licensePlate, c.carColor, c.carType, c.company" +
            ", p.parkName FROM Car c INNER JOIN Parkinglot p ON c.parkinglot.parkId = p.parkId")
    Page<Car> findAll(Pageable pageable);


    @Query("SELECT c.licensePlate, c.carColor, c.carType, c.company" +
            ", p.parkName  FROM Car c INNER JOIN Parkinglot p ON c.parkinglot.parkId = p.parkId" +
            " WHERE p.parkId = :id ")
    List<Car> findByParkinglot_ParkId(@Param("id") Integer id);

    @Query(value = "SELECT c.licensePlate, c.carColor, c.carType, c.company" +
            ", p.parkName  FROM Car c INNER JOIN Parkinglot p ON c.parkinglot.parkId = p.parkId" +
            " WHERE p.parkName LIKE  %:name%  ")
    List<Car> findByParkinglot_ParkName(@Param("name") String name);

    Car findByLicensePlate(String licensePlate);
}
