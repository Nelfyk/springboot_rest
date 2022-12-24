package com.ruslanburduzhan.spring.springboot_rest.dao;

import com.ruslanburduzhan.spring.springboot_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    /*
    JpaRepository<T,T>
        первый generic это Entity с которым будем работать
        второй generic это тип PrimaryKey первого generic-а

    CRUD методы Spring Data JPA:
        findAll  - Получение всех entity
        findById - Получение одного entity
        save     - Сохранение/Изменение entity
        deleteById - Удаление entity
    */
    List<Employee> findAllByName(String name);
}
