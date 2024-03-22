package com.example.EmployeePayroll.repo;

import com.example.EmployeePayroll.entity.PerformanceReview;
import com.example.EmployeePayroll.entity.ProjectDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDetailsRepo extends JpaRepository<ProjectDetails, Integer> {
}
