package com.example.EmployeePayroll.repo;

import com.example.EmployeePayroll.entity.Department;
import com.example.EmployeePayroll.entity.LeaveDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveDetailsRepo extends JpaRepository<LeaveDetails, Integer> {
}
