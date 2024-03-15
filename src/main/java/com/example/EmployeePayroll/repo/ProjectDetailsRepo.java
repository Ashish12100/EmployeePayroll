package com.example.EmployeePayroll.repo;

import com.example.EmployeePayroll.entity.PerformanceReview;
import com.example.EmployeePayroll.entity.ProjectDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDetailsRepo extends JpaRepository<ProjectDetails, Integer> {
}
