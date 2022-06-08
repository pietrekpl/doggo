package com.example.doggo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoggoRestController {

    private int counter = 0;

    @PostMapping("/dogclicker")
    public String clicker() {
        counter += 1;
        return "Dog has eaten " + counter + " carrots already.";
    }

    @GetMapping("/dogclicker")
    public String returnClick() {
        return "Dog has " + counter + " carrots in the tummy.";
    }
}
