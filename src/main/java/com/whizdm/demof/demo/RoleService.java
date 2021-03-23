package com.whizdm.demof.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    Rolerepository repo;

    Role register(Role newRole){
        repo.save(newRole);
        return newRole;
    }
}
