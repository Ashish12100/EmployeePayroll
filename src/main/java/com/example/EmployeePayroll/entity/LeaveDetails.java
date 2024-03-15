package com.example.EmployeePayroll.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "leave_details")
public class LeaveDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leaveId;

    @ManyToMany
    @JoinTable(name="employee", joinColumns = @JoinColumn(name = "empId"))
    private List<Employee> empId;

    private String leaveType;

    public int getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(int leaveId) {
        this.leaveId = leaveId;
    }

    public List<Employee> getEmpId() {
        return empId;
    }

    public void setEmpId(List<Employee> empId) {
        this.empId = empId;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }
}
