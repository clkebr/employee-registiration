package com.spring.employeeregistiration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class Employee {
//    @NotNull  // accept everything except null like ""
//    @NotBlank // not accept "" or null but accept " "
//    @NotEmpty // accept at least one char, not accept "", " ", null

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstname;
    private String lastname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;


}
