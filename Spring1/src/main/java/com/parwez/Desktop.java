package com.parwez;

public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("compiling... using desktop");
    }
}
