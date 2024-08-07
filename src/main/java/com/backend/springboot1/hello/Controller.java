package com.backend.springboot1.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/com/backend/springboot1/hello")
public class Controller {

    @GetMapping("/world")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/you")
    public String helloyou(@RequestParam("name")String name){
        return "Hello " + name;
    }
}
