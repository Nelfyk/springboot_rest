package com.ruslanburduzhan.spring.springboot_rest.dao;

import com.ruslanburduzhan.spring.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
