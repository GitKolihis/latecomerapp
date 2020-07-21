package com.gitkolihis.latecomerapp.service;

import com.gitkolihis.latecomerapp.entity.Employee;
import com.gitkolihis.latecomerapp.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRespository employeeRespository;

    public Employee addemployee(Employee employee) {
        return employeeRespository.save(employee);
    }

    public Employee updateemployee(Employee employee) {
        return employeeRespository.save(employee);
    }

    public List<Employee> findAllEmployee() {
        return (List<Employee>) employeeRespository.findAll();
    }

    public Employee getEmployee(long id) {
        Optional<Employee> optionalEmployee = employeeRespository.findById(id);
        return optionalEmployee.orElseThrow(() -> new IllegalArgumentException("Invalid Employee Id: " + id));
    }

    public Employee findByEmail(String email) {
        return employeeRespository.findByEmail(email);
    }
}
