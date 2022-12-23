package com.ruslanburduzhan.spring.springboot_rest.service;

import com.ruslanburduzhan.spring.springboot_rest.dao.EmployeeDAO;
import com.ruslanburduzhan.spring.springboot_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
