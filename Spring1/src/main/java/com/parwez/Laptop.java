package com.parwez;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("com2")
@Primary
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop Object created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling.... using laptop");
    }
}