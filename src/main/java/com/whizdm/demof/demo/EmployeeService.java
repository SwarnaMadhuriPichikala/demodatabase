package com.whizdm.demof.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService{
    @Autowired
    Employeerepository repo;
    Employees register(Employees newUser){
        repo.save(newUser);
        return newUser;
    }
}
