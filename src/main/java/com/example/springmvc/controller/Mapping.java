package com.example.springmvc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mapping")
public class Mapping {
    @GetMapping
    public String hellow() {
      return "hello hello pakaypo";
    }
//    @GetMapping("hello??")
//    public String hellowMapping() {
//        return "hello hello pakayooooooo";
//    }
    @GetMapping("hello/**")
    public String hellow1() {
        return "hello hello pakayooooooo";
    }
    @PostMapping("/{name}/{value}")
    public String hii(@PathVariable("name") String myname,@PathVariable("name") int value){
        return "path variable is"+myname+"and value is"+value;
    }
}
