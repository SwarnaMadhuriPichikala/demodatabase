package com.whizdm.demof.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService{

    @Autowired
    Productrepository repo;

    Products register(Products newUser){
        repo.save(newUser);
        return newUser;
    }
}
