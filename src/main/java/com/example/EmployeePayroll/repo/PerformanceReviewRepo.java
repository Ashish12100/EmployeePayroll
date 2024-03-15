package com.example.EmployeePayroll.repo;

import com.example.EmployeePayroll.entity.Department;
import com.example.EmployeePayroll.entity.PerformanceReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformanceReviewRepo extends JpaRepository<PerformanceReview, Integer> {
}
