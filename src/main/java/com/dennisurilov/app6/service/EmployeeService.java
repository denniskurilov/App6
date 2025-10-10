package com.dennisurilov.app6.service;

import com.dennisurilov.app6.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Integer id);

    Employee save(Employee employee);

    void delete(Employee employee);
}
