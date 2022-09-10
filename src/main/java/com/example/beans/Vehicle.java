package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class  Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void initialize(){
        this.name="Jeep";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destrying bean");
    }
    public void hello(){
        System.out.println("Hello from vehicle class");
    }
}
