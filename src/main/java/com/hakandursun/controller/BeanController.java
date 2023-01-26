package com.hakandursun.controller;


import com.hakandursun.bean.BeanConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class BeanController {

    @Autowired
    BeanConfig beanConfig;



    //  http://localhost:8080/bean/dto
    @GetMapping("/bean/dto")  // url
    @ResponseBody  //html olmadan direk ekranda göstermek için
    public String getBeanDto(){
        return beanConfig.beanDto().toString();
    }




}
