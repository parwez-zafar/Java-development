package com.parwez.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName (){
        return "Java";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
    }



//    Servlet way to getting data

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//
//        int result = num1 + num2;
//        session.setAttribute("result", result);  // passinng the variable into jsp
//
//        System.out.println("In Add Method" + result);
//        return "result.jsp";
//    }




//// Spring way
//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session) {  // here query parameter is num1 and num2 that is why
//        int result = num1 + num2;
//        session.setAttribute("result", result);  // passing the variable into jsp
//
//        System.out.println("In Add Method" + result);
//        return "result.jsp";
//    }

    // Spring way without session
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {  // here query parameter is num1 and num2 that is why
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        System.out.println("In Add Method" + result);
        return mv;
    }


    @RequestMapping("/addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {  // here query parameter is num1 and num2 that is why
    public ModelAndView addAlien(@ModelAttribute("alien1")  Alien alien, ModelAndView mv) {  // here query parameter is num1 and num2 that is why

//        alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);


        mv.addObject("alien", alien);
        mv.setViewName("result");
        return mv;
    }
}
