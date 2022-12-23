package com.ruslanburduzhan.spring.springboot_rest.controller;

import com.ruslanburduzhan.spring.springboot_rest.entity.Employee;
import com.ruslanburduzhan.spring.springboot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RESTController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
