package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestControllerExample {

	 @GetMapping("/hello")
	    // Easy method just to print encouraging and consoling words
	    public String hello() {
	        return "Hello Geek, this is a simple hello message to take care and have a nice day. How are you by the way!! all good?";
	    }
	     
	    @GetMapping("/greet")
	    //Easy method just to print greeting message by saying spring-based applications
	    public String greet() {
	        return "Hello Geek, Fast and easy development can be possible on Spring-based applications by reducing source code;.";
	    }
}
