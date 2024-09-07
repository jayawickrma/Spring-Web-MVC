package com.example.springmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

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
    public String hii(@PathVariable("name") String myname,@PathVariable("value") int value){
        return "path variable is"+myname+"and value is"+value;
    }
    @PostMapping(params = {"name","age"})
    public String hellowMapping(@RequestParam("name")String myname ,@RequestParam("age")int myage){
        return "my name is "+ myname +" and my age is "+ myage;
    }
    @PostMapping(headers = {"X-city","Content-Type"})
    public String hellow6(@RequestHeader("X-city") String MyCustomHeader,@RequestHeader("Content-Type") String contect){
        return "My Custom Header is "+ MyCustomHeader +" and my context is "+contect;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)    //using comsumes we can give the mime type of client
    public String helllowMapping(){
       return "Json mime type handle";
    }
}
