package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repos.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
class ViewController {
    @Autowired
    EmployeeRepos repos;


    @GetMapping("/employee/view/{id}")
    public String viewEmployee(@PathVariable int id, Model model) {
        Employee employee = repos.findById(id).orElseThrow(() -> new IllegalArgumentException("Сотрудник не обнаружен"));
        model.addAttribute("employee", employee);
        return "employee";
    }

    @GetMapping("/updateSalaryForm")
    public String updateSalaryForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "update_salary";
    }

        @GetMapping("/updatePassportForm")
    public String updatePassportForm(Model model){
        model.addAttribute("employee",new Employee());
        return  "update_passport";
    }
}
