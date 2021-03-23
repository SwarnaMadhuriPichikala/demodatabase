package com.whizdm.demof.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    public RoleService roleService;

    public RoleController(RoleService ps){
        this.roleService = ps;
    }

    @PostMapping("register/role")
    Role register(@RequestBody Role newRole){

        return roleService.register(newRole);
    }
}
