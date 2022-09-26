package com.jini.app.greeting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreetingController {

    @RequestMapping({"/hello","/"})
    public String sayHello() {
    	System.out.println("HI this is a TEST.....");
        return "Hello";
    }
}
