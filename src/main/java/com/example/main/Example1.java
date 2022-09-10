package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
    /*
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());

      */
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */

     /*  var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh0 = context.getBean("vwMotors",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh0.getName());


        Vehicle veh = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        //Creating application context for each scenario vechile
        Vehicle veh1 = context.getBean("havalMotors",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());
        //When you multple bean of the same return type
        Vehicle veh2 = context.getBean(Vehicle.class);
        System.out.println("Primary vehicle name from Sprin context" + veh2.getName());

           * */
        /*
        We don’t need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn’t exist,Spring will throw an exception.
        * */
      /*  String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: " + num);
    */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from spring context is "+vehicle.getName());
        vehicle.hello();
    }
}
