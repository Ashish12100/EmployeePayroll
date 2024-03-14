package com.example.EmployeePayroll.controller;

import com.example.EmployeePayroll.entity.Employee;
import com.example.EmployeePayroll.entity.Payroll;
import com.example.EmployeePayroll.service.DepartmentService;
import com.example.EmployeePayroll.service.EmployeeService;
import com.example.EmployeePayroll.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/payroll")
public class PayrollController {
    @Autowired
    PayrollService payrollService;
    
    @PostMapping("/createPayroll")
    public Payroll createPayroll(@RequestBody Payroll payroll){
        return payrollService.createPayroll(payroll);
    }
    @GetMapping("/getAll")
    public List<Payroll> getAll(){
        return payrollService.getAll();
    }

    @PutMapping("/updatePayroll/{id}")
    public Payroll updatePayrollById(@PathVariable int id, @RequestBody Payroll payroll){
        return payrollService.updatePayrollById(id,payroll);
    }

    @DeleteMapping("/deletePayroll/{id}")
    public String deleteEmpById(@PathVariable int payRollId){
        return payrollService.deleteEmpById(payRollId);
    }
}
