package com.ruslanburduzhan.spring.springboot_rest.service;

import com.ruslanburduzhan.spring.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
