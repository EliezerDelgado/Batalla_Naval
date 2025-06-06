package com.eliezer.Batalla_Naval.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaContoller {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    @GetMapping("/bye")
    public String bye(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Bye bye %s! see you tomorrow", name);
    }
}
