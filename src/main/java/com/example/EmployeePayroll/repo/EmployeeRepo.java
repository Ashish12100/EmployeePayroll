package com.example.EmployeePayroll.repo;

import com.example.EmployeePayroll.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
