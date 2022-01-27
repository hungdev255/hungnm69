package com.parking.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Column(length = 50)
    private String account;

    @Column(length = 10)
    private String department;

    @Column(length = 50)
    private String employeeAddress;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date employeeBirthdate;

    @Column(length = 50)
    private String employeeEmail;

    @Column(length = 50)
    private String employeeName;

    @Column(length = 10)
    private String employeePhone;

    @Column(length = 20)
    private String password;

    @Column(length = 1)
    private String sex;

}
