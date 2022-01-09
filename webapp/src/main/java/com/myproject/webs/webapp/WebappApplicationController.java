package com.myproject.webs.webapp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebappApplicationController {

    @RequestMapping
    public String helloWorld(){

        return "Hello world for spring boot";
    }

    @RequestMapping("/goodBye")
    public String goodBye(){

        return "Thank you and Good Bye";

    }
}
