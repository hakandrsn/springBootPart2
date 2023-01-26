package com.hakandursun.bean;

import com.hakandursun.controller.BeanController;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class PostContructTutorials {


 /*   // @@@@@@@@@@@@@@@@@@@@@@@@@@@
    @Autowired
    Logger LOG;

    *//*    public PostContructTutorials() {
            LOG.info("BeanController oluşturuldu log 4j2");
        }*//*

    //başlangıçta boş olduğu için constructor da null geldi bizde PostConstruct yaptık
    @PostConstruct
    public void init(){
        LOG.info("BeanController init metodu çalıştı");
    }

    public static void main(String[] args) {
        PostContructTutorials postContructTutorials = new PostContructTutorials();
        System.out.println(postContructTutorials);
    }*/
}
