package com.spring.employeeregistiration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {


    @RequestMapping("/register")
    public String createEmployee(){
        return "employee/employee-create";

    }
}
