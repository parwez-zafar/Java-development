package com.parwez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("30")
    private int age;

//    @Qualifier("com2")
    private Computer com;

    @Value("5000")
    private int salary;

    public Alien(){
        System.out.println("Alien object created...");
    }

//    @ConstructorProperties({"age", "lap", "salary"})
//    public Alien(int age, Computer com, int salary){
//        System.out.println("Para Constructor Called");
//        this.age = age;
//        this.com = com;
//        this.salary = salary;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public  void code()
    {
        System.out.println("Coding....");
        com.compile();
        System.out.println("salary is " + this.salary);

    }
}
