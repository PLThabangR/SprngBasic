package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
@ComponentScan(basePackages= "com.example.beans;")
public class ProjectConfig {
    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */
  /*
    @Bean("vwMotors")
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("GTI");
        return veh;
    }
    //testing
    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Jeep");
        return veh;
    }

    @Primary
    @Bean(name="havalMotors")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Haval");
        return veh;
    }

    @Bean
    String hello() {
        return "Jesus is Lord";
    }

    @Bean
    Integer number() {
        return 29;
    }

   */
}
