package com.nishant.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String Hellowir() {

        return "Hello";

    }

    @GetMapping("/about")
    public String about() {

        return "about  page";

    }

}
