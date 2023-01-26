package com.hakandursun.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;

    //başlangıç
    public void initialBeanMethod(){
        log.info("başlamadan önce");
        System.out.println("başlamadan öncex");
    }
    //bitiş
    public void destroyBeanMethod(){
        log.info("bittikten sonra");
        System.err.println("bittikten sonrax");
    }
}
