package com.devopsassignment.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SonarQubeControllerTest {

     @GetMapping("/test")
	    public String test() {
	        return "Testing successfull!!";
	    }
        
}
