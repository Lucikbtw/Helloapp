package com.example.Helloapp.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(path = "/world")
    public String greetingWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/name/{nameValue}")
    public String greetingName(@RequestParam String name) {
        name = "господин " + name;
        return "Hello " + name + "!!!";
    }

    @GetMapping(path = "/num")
    public int greetingNum(@RequestParam int num) {
        if (num % 2 == 0){
            num = 0;
        } else {
            num = 1;
        }
        return num;
    }

    @GetMapping(path = "/number/{number1}")
    public int greetingNumber(@PathVariable(name = "number1") int number) {
        if (number >= 0){
            number = 0;
        } else {
            number = 1;
        }
        return number;
    }




}
