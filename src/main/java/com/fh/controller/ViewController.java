package com.fh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/login")
    public String gotoLogin(){
        return "login";
    }

    @RequestMapping("/unauthorized")
    public String gotoUnauthorized(){
        return "/jsp/unauthorized";
    }

    @RequestMapping("/user")
    public String gotoUser(){
        return "/jsp/user";
    }

    @RequestMapping("/admin")
    public String gotoAdmin(){
        return "/jsp/admin";
    }
}
