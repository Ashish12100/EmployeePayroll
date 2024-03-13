package com.example.EmployeePayroll.controller;

import com.example.EmployeePayroll.entity.Employee;
import com.example.EmployeePayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/employee")
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

    @PutMapping("/updateEmp")
    public Employee updateEmp(@RequestBody Employee emp){
        return employeeService.update(emp);
    }

    @DeleteMapping("/deleteEmp/{id}")
    public String deleteEmpById(@PathVariable int empId){
        return employeeService.deleteEmpById(empId);
    }
}
