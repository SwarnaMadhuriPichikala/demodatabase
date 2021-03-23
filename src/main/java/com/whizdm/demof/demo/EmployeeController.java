package com.whizdm.demof.demo;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    public EmployeeController(EmployeeService ps){
        this.employeeService = ps;
    }
    @GetMapping("/status")
    String hello(){
        return "HEll o, World!";
    }
    @PostMapping("/register")
    Employees register(@RequestBody Employees newUser){
        return employeeService.register(newUser);
    }
    @GetMapping("/findallorders")
    public List<Employees> findallorders(){
        return employeeService.repo.findAll();
    }


}