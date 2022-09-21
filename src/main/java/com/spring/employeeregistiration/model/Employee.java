package com.spring.employeeregistiration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class Employee {
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;


}
