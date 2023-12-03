package com.example.employee.Controlleur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.employee.Modèle.Employee;
import com.example.employee.Service.EmployeeService;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {
    @Autowired
    EmployeeService empService;


    @RequestMapping(value="/createEmp", method= RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee emp) { return empService.createEmployee (emp);
    }
    @RequestMapping(value="/getEmp", method=RequestMethod.GET)
    public List<Employee> readEmployees() { return empService.getEmployees();
    }
    @RequestMapping(value="/updateEmp/{empId}", method=RequestMethod.PUT)
    public Employee readEmployees (@PathVariable(value = "empId") Long id, @RequestBody Employee empDetails) {
        return empService.updateEmployee (id, empDetails);
    }
    @RequestMapping(value="/deleteEmp/{empId}", method=RequestMethod.DELETE)
    public String deleteEmployees(@PathVariable(value = "empId") Long id) { return empService.deleteEmployee(id);
    }
}
