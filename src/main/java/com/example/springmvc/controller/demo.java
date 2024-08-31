package com.example.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("nishan")
public class demo{
    @GetMapping
    public String healthTest(){
        return "healthTest";
    }
    @GetMapping("other")
    public String get(){
        return "get";
    }
    @PostMapping
    public String update(){return "update";}


}
