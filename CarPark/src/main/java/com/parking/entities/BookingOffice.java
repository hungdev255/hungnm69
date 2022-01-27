package com.parking.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;


@Entity
@Data
@Table(name="bookingOffice")
public class BookingOffice  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer officeId;

    private Date endContractDeadline;

    @Column(length = 50)
    private String officeName;

    @Column(length = 11)
    private String officePhone;

    @Column(length = 50)
    private String officePlace;

    private BigInteger officePrice;

    private Date startContractDeadline;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tripId", referencedColumnName = "tripId")

    private Trip trip;


}
