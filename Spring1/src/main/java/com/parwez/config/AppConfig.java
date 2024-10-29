package com.parwez.config;

import com.parwez.Alien;
import com.parwez.Computer;
import com.parwez.Desktop;
import com.parwez.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.parwez")
public class AppConfig {


//    @Bean
////    public Alien alien(@Autowired @Qualifier("laptop") Computer com){
//    public Alien alien(@Autowired Computer com){
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
////    @Bean(name= {"com2", "com1", "multipleName"})
//
////    @Scope(value = "prototype")  // using prototype scope we can create multiple object.
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }


}
