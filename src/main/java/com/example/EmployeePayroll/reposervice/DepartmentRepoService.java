package com.example.EmployeePayroll.reposervice;

import com.example.EmployeePayroll.entity.Department;
import com.example.EmployeePayroll.repo.DepartmentRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class DepartmentRepoService {
    private  DepartmentRepo repo;

    public Department createDepartment(Department dept) {
        return repo.save(dept);
    }

    public List<Department> getAll() {
        return repo.findAll();
    }

    public Department updateDeptById(int id,Department dept) {
        Optional<Department> department = repo.findById(id);
        if (department.isPresent()) {
            int deptId = department.get().getDeptId();
            dept.setDeptId(deptId);
            return repo.save(dept);
        }else{
            return repo.save(dept);
        }
    }

    public String deleteDeptById(int deptId) {
        repo.deleteById(deptId);
        return "Deleted!!!";
    }


}

