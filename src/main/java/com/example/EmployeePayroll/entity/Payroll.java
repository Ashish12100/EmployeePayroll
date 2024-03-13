package com.example.EmployeePayroll.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payroll {
    @Id
    private int payRollId;
    private double salary;
    private double allowances;
    private double taxes;

    public double getPayRollId() {
        return salary;
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
