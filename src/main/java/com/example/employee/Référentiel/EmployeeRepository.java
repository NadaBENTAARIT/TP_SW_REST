package com.example.employee.Référentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.Modèle.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
