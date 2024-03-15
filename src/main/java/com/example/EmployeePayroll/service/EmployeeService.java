package com.example.EmployeePayroll.service;

import com.example.EmployeePayroll.entity.Employee;
import com.example.EmployeePayroll.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepo repo;

    @Autowired
    public EmployeeService(EmployeeRepo repo) {
        this.repo = repo;
    }

    public Employee createEmployee(Employee emp) {
        Employee emp1 = repo.save(emp);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
        return emp1;
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee updateEmpById(int id,Employee emp) {
        Optional<Employee> employee = repo.findById(id);
        if (employee.isPresent()) {
           /* int empId = employee.get().getEmpId();
            emp.setEmpId(empId);*/
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
