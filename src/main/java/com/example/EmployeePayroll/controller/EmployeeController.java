package com.example.EmployeePayroll.controller;

import com.example.EmployeePayroll.entity.Employee;
import com.example.EmployeePayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/createEmp")
    public Employee createEmp(@RequestBody Employee emp){
        return employeeService.createEmployee(emp);
    }
    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PutMapping("/updateEmp/{id}")
    public Employee updateEmpId(@PathVariable int id ,@RequestBody Employee emp){
        return employeeService.updateEmpById(id,emp);
    }

    @DeleteMapping("/deleteEmp/{id}")
    public String deleteEmpById(@PathVariable int empId){
        return employeeService.deleteEmpById(empId);
    }
}
