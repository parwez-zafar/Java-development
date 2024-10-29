package com.parwez.SpringBootdemo.service;

import com.parwez.SpringBootdemo.repo.LaptopRepository;
import com.parwez.SpringBootdemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService
{

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGood(Laptop lap){
        return true;
    }
}
