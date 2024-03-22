package com.example.EmployeePayroll.repo;

import com.example.EmployeePayroll.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll,Integer> {
}
