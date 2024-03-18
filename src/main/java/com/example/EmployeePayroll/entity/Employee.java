package com.example.EmployeePayroll.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@ToString
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String name;
    private long phone;
    private String address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deptId", referencedColumnName = "deptId")
    private Department deptId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payRollId", referencedColumnName = "payRollId")
    private Payroll payrollId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projectId", referencedColumnName = "projectId")
    private ProjectDetails projectDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prId", referencedColumnName = "prId")
    private PerformanceReview performanceReview;

    @ManyToMany
    @JoinTable(name="leave_details", joinColumns = @JoinColumn(name = "leaveId"))
    private List<LeaveDetails> leaveId;
}
