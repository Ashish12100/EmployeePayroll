package com.example.EmployeePayroll.service;

import com.example.EmployeePayroll.entity.Employee;
import com.example.EmployeePayroll.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repo;
    public Employee createEmployee(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee updateEmpById(int id,Employee emp) {
        Optional<Employee> employee = repo.findById(id);
        if (employee.isPresent()) {
            int empId = employee.get().getEmpId();
            emp.setEmpId(empId);
            return repo.save(emp);
        }else{
            return repo.save(emp);
        }
    }

    public String deleteEmpById(int empId) {
        repo.deleteById(empId);
        return "Deleted!!!";
    }
}
