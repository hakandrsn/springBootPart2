package com.hakandursun.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleadController {


    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
  //  @ResponseBody
    public String getThymeleaf1(){
        return "thymeleaf1";
    }

    //http://localhost:8080/thymeleaf2
    @GetMapping("/xmlnameserver")
    public String getThymeleaf2(){
        return "xmlnameserver";
    }

    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model){
        model.addAttribute("name","Hakan");
        return "thymeleaf";
    }


    //http://localhost:8080/thymeleaf4

    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model){
        model.addAttribute("key","keyimsi");
        return "thymeleaf4";
    }
}
