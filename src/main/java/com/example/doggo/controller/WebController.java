package com.example.doggo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/doggo")
    public String helloDoggo(){
        return "doggo";
    }
}
