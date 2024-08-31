package com.example.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("map")
public class Mapping {
    @GetMapping
    public String hellow() {
      return "hello hello pakaypo";
    }
}
