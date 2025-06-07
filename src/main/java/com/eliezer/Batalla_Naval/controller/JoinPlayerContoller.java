package com.eliezer.Batalla_Naval.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JoinPlayerContoller {
    ArrayList<String> list = new ArrayList<>();
    int num = 1;
    @GetMapping("/player")
    public String player(@RequestParam(value = "name", defaultValue = "player "+1) String name) {
        list.add(name);
        num++;
        return String.format("Hello %s!", name);
    }

    @GetMapping("/list")
    public String list() {
        return String.join(System.lineSeparator(), list);
    }
}
