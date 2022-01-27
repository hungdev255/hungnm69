package com.parking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ticket")
public class Ticket  {

    @Id
    @Column(name="ticketId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketId;

    @Column(name="bookingTime")
    private Time bookingTime;

    @Column(name="customerName", length = 11)
    private String customerName;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "licensePlate", nullable = false, referencedColumnName = "licensePlate")
//    @JsonIgnore
    private Car car;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tripId", nullable = false, referencedColumnName = "tripId")
//    @JsonIgnore
    private Trip trip;


}
