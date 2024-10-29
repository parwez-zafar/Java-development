package com.parwez;
import com.parwez.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // Java Based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop dt = context.getBean(Desktop.class);
        dt.compile();
        Desktop dt2 = context.getBean(Desktop.class);
        System.out.println("--------------------");
        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();


























//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create the object, see the spring.xml file and create all object which is specified inside bean tag
//        Alien obj = (Alien) context.getBean("alien1");  // using the object

//        obj.age = 5;
//        System.out.println(obj.age);
//        obj.code();


//        Alien obj1 = (Alien) context.getBean("alien1");  // using the object
//        obj1.code();
//        System.out.println(obj1.age);

//        obj.setAge(5);
//        System.out.println(obj.getAge());
//        obj.code();




    }
}
