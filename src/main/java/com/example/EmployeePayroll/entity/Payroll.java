package com.example.EmployeePayroll.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "payroll")
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payRollId;
    private double salary;
    private double allowances;
    private double taxes;

    @OneToOne
    private Employee emp;

    public int getPayRollId() {
        return payRollId;
    }
    public void setPayRollId(int payRollId) {
        this.payRollId = payRollId;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAllowances() {
        return allowances;
    }
    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public double getTaxes() {
        return taxes;
    }
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public Payroll() {
    }

    public Payroll(double salary, double allowances, double taxes) {
        this.salary = salary;
        this.allowances = allowances;
        this.taxes = taxes;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payRollId=" + payRollId +
                ", salary=" + salary +
                ", allowances=" + allowances +
                ", taxes=" + taxes +
                '}';
    }
}
