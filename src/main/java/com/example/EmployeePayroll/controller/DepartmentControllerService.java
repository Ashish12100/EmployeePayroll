package com.example.EmployeePayroll.controller;

import com.example.EmployeePayroll.entity.Department;
import com.example.EmployeePayroll.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deptserv")
public class DepartmentControllerService {

   private final DepartmentService departmentService;

    @Autowired
    public DepartmentControllerService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/createDept")
    public Department createDept(@RequestBody Department dept){
        return departmentService.createDepartment(dept);
    }
    @GetMapping("/getAll")
    public List<Department> getAll(){
        return departmentService.getAll();
    }

    @PutMapping("/updateDept/{id}")
    public Department updateDeptById(@PathVariable int id , @RequestBody Department dept){
        return departmentService.updateDeptById(id,dept);
    }

    @DeleteMapping("/deleteDept/{id}")
    public String deleteDeptById(@PathVariable int deptId){
        return departmentService.deleteDeptById(deptId);
    }
}
