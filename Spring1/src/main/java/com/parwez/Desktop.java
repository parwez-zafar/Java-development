package com.parwez;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop Object create");
    }
    @Override
    public void compile() {
        System.out.println("compiling... using desktop");
    }
}
