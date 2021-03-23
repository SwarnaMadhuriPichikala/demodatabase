package com.whizdm.demof.demo;
import javax.annotation.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roleid;
    private String rolename;
    public List<Employees> getEmployees() {
        return employees1;
    }
    public void setEmployees(List<Employees> employees) {
        this.employees1 = employees;
    }
    @ManyToMany(mappedBy = "roles")
    private List<Employees> employees1=new ArrayList<>();

    public Role(Integer roleid, String rolename, List<Employees> employees1) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.employees1 = employees1;
    }

    public Role() {

    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
