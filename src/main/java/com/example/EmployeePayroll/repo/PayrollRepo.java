package com.example.EmployeePayroll.repo;

import com.example.EmployeePayroll.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollRepo extends JpaRepository<Payroll,Integer> {
}
