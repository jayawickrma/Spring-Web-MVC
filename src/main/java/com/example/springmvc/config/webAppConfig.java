package com.example.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.example.springmvc")
@EnableWebMvc   //application layer ekt direct sambanda wena nisa meka magin controller wlata direct full access hambenawa web mvc facilities
public class webAppConfig{
}
