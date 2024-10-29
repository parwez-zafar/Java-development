package com.parwez;

public class Laptop implements Computer {

    Laptop(){
        System.out.println("Laptop created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling.... using laptop");
    }
}
