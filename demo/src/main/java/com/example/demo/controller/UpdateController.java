package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repos.EmployeeRepos;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UpdateController {
    @Autowired
    private final EmployeeService employeeService;

    @Autowired
    public UpdateController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/updateSalary")
    public void updateSalary(@RequestParam int employeeID, @RequestParam double salary) {
        employeeService.updateSalary(employeeID, salary);
    }

    @PostMapping("/UpdatePassport")
    public void UpdatePassport(@RequestParam int employeeID, @RequestParam int passportNumber, @RequestParam int passportDate) {
        employeeService.UpdatePassport(employeeID, passportNumber, passportDate);
    }
}

