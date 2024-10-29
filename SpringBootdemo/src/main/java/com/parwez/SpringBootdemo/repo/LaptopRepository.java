package com.parwez.SpringBootdemo.repo;

import com.parwez.SpringBootdemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saving Laptop in DataBase");
    }
}
