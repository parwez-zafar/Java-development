package com.parwez;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("In service methode.....");
    }

}
