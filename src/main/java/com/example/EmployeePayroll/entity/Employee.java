package com.example.EmployeePayroll.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;



@ToString
@Entity
@Table(name = "employee")
public class Employee {
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department getDeptId() {
        return deptId;
    }

    public void setDeptId(Department deptId) {
        this.deptId = deptId;
    }

    public Payroll getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(Payroll payrollId) {
        this.payrollId = payrollId;
    }

    public ProjectDetails getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(ProjectDetails projectDetails) {
        this.projectDetails = projectDetails;
    }

    public PerformanceReview getPerformanceReview() {
        return performanceReview;
    }

    public void setPerformanceReview(PerformanceReview performanceReview) {
        this.performanceReview = performanceReview;
    }

    public List<LeaveDetails> getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(List<LeaveDetails> leaveId) {
        this.leaveId = leaveId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String name;
    private long number;
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
    @JoinTable(name="leave-details", joinColumns = @JoinColumn(name = "leaveId"))
    private List<LeaveDetails> leaveId;

}
