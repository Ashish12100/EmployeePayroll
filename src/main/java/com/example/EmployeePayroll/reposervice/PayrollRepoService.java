package com.example.EmployeePayroll.reposervice;

import com.example.EmployeePayroll.entity.Payroll;
import com.example.EmployeePayroll.repo.PayrollRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PayrollRepoService {

    private  PayrollRepo repo;


    public Payroll createPayroll(Payroll payroll) {
        return repo.save(payroll);
    }

    public List<Payroll> getAll() {
        return repo.findAll();
    }

    public Payroll updatePayrollById(int id, Payroll payroll) {
        Optional<Payroll> payRoll = repo.findById(id);
        if (payRoll.isPresent()){
            /*int payrollId = payRoll.get().getPayRollId();
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

