package com.gitkolihis.latecomerapp.repository;

import com.gitkolihis.latecomerapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {

    Employee findByName(String name);

    Employee findByEmail(String email);
}
