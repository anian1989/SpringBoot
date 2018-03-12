package com.boot.Controller;

import com.boot.Component.ComponentProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by junshuaizhang1 on 2018/3/8.
 */
@RestController
public class HelloWorldController {
    private Logger log = LoggerFactory.getLogger(HelloWorldController.class);
    @Value("${com.boot.title}")
    private String title;
    @Value("${com.boot.description}")
    private String description;
    @Value("${author.intro}")
    private String authorintro;
    @Value("${yml.email}")
    private String ymlemail;



    @RequestMapping("/hello")
    public String Hello(){
        log.info("Apache.Commons 日志输出");
        return ymlemail;
    }
}
