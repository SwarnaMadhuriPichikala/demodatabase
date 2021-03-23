package com.whizdm.demof.demo;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Employees {
    @Id
    private Integer employee_id;
    private String employeename;
    private String employeeemail;
    private String employeepassword;
    @ManyToMany
    private List<Role> roles=new ArrayList<>();

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeemail() {
        return employeeemail;
    }

    public void setEmployeeemail(String employeeemail) {
        this.employeeemail = employeeemail;
    }

    public String getEmployeepassword() {
        return employeepassword;
    }

    public void setEmployeepassword(String employeepassword) {
        this.employeepassword = employeepassword;
    }

    public Employees(){

    }

    public Employees(Integer employee_id, String employeename, String employeeemail, String employeepassword, List<Role> roles) {
        this.employee_id = employee_id;
        this.employeename = employeename;
        this.employeeemail = employeeemail;
        this.employeepassword = employeepassword;
        this.roles = roles;
    }
}