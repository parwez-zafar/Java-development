package com.parwez;

public class Alien {
    private int age;
    private Computer com;
    private int salary;

    public Alien(){
        System.out.println("object created...");
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
        System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

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
