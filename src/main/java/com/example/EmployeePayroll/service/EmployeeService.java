package com.example.EmployeePayroll.service;

import com.example.EmployeePayroll.entity.Employee;
import com.example.EmployeePayroll.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
    @Autowired
    EmployeeRepo repo;
    public Employee createEmployee(Employee emp) {
        return  repo.save(emp);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee update(Employee emp) {
        return repo.save(emp);
    }

    public String deleteEmpById(int empId) {
        repo.deleteById(empId);
        return "Deleted";
    }
}
