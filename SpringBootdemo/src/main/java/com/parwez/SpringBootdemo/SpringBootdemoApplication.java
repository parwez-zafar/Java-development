package com.parwez.SpringBootdemo;

import com.parwez.SpringBootdemo.model.Alien;
import com.parwez.SpringBootdemo.model.Laptop;
import com.parwez.SpringBootdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootdemoApplication.class, args);
//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();


		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

	}


}
