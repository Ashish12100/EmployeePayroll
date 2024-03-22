package com.example.EmployeePayroll.repo;

import com.example.EmployeePayroll.entity.Department;
import com.example.EmployeePayroll.entity.LeaveDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveDetailsRepo extends JpaRepository<LeaveDetails, Integer> {
}
