package com.example.EmployeePayroll.service;

import com.example.EmployeePayroll.entity.Payroll;
import com.example.EmployeePayroll.repo.PayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayrollService {

    private final PayrollRepo repo;

    @Autowired
    public PayrollService(PayrollRepo repo) {
        this.repo = repo;
    }

    public Payroll createPayroll(Payroll payroll) {
        return repo.save(payroll);
    }

    public List<Payroll> getAll() {
        return repo.findAll();
    }

    public Payroll updatePayrollById(int id, Payroll payroll) {
        Optional<Payroll> payRoll = repo.findById(id);
        if (payRoll.isPresent()){
            /*int payrollId = payRoll.get(0).
            payroll.setPayRollId(payrollId);*/
            return repo.save(payroll);
        }
        else {
            return repo.save(payroll);
        }
    }

    public String deleteEmpById(int payRollId) {
        repo.deleteById(payRollId);
        return "Deleted!!!";
    }


}

