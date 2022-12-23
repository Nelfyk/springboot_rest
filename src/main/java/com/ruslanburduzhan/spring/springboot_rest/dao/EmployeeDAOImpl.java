package com.ruslanburduzhan.spring.springboot_rest.dao;

import com.ruslanburduzhan.spring.springboot_rest.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    //    @Autowired
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Employee").getResultList(); // returns List<Employee>
    }
}
