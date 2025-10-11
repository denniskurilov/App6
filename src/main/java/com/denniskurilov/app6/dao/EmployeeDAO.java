package com.denniskurilov.app6.dao;

import com.denniskurilov.app6.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(Integer id);

    Employee save(Employee employee);

    void delete(Employee employee);
}
