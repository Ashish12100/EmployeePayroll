package com.example.EmployeePayroll.repo;

import com.example.EmployeePayroll.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
