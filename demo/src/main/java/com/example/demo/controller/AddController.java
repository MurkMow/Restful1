package com.example.demo.controller;
import com.example.demo.model.Employee;
import com.example.demo.repos.EmployeeRepos;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
public class AddController {
    @Autowired
    private final EmployeeService employeeService;

    @Autowired
    public AddController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/addEmployee")
    public void addPerson(@RequestBody Employee people) {
        employeeService.addPerson(people);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        return ResponseEntity.ok(employee);
    }
}

