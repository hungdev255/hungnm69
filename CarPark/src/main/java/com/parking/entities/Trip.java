package com.parking.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Data
@Table(name = "trip")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Trip{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tripId;

    private Integer bookedTicketNumber;

    @Column(length = 11)
    private String carType;

    private Date depatureDate;

    private Time depatureTime;

    @Column(length = 50)
    private String destination;

    @Column(length = 11)
    private String driver;

    private Integer maximumOnlineTicketNumber;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<BookingOffice> bookingOffices;

}
