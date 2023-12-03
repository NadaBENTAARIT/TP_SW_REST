package com.example.employee.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employee.Référentiel.EmployeeRepository;
import com.example.employee.Modèle.Employee;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    // CREATE
    public Employee createEmployee (Employee emp) { return employeeRepository.save(emp);
    }
    // READ
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
    // DELETE
    public String deleteEmployee (Long empId) {
        employeeRepository.deleteById(empId);
        return "Employe deleted successfully";
    }
    // UPDATE
    public Employee updateEmployee (Long empId, Employee employeeDetails) {
        Employee emp = employeeRepository.findById(empId).get();
        emp.setFirstName (employeeDetails.getFirstName());
        emp.setLastName (employeeDetails.getLastName());
        emp.setEmailId(employeeDetails.getEmailId());
        return employeeRepository.save(emp);
    }
}