package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repos.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class EmployeeService {

    private final EmployeeRepos EmployeeRepos;

    @Autowired
    public EmployeeService(EmployeeRepos EmployeeRepos){
        this.EmployeeRepos=EmployeeRepos;
    }
    public void addPerson(Employee people) {
        EmployeeRepos.save(people);
    }

    public Employee getEmployee(int id) {
        return EmployeeRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Сотрудник не обнаружен"));
    }


    public void updateSalary(int employeeID, double salary) {
        Employee employee1 = new Employee();
        employee1.setEmployeeID(employeeID);
        employee1.setSalary(salary);
        EmployeeRepos.save(employee1);
    }

    public void UpdatePassport(int employeeID, int passportNumber, int passportDate){
        Employee employee1 = new Employee();
        employee1.setEmployeeID(employeeID);
        employee1.setPasportNumber(passportNumber);
        employee1.setPasportDate(passportDate);
        EmployeeRepos.save(employee1);
    }
}
