package com.example.demoserver;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServerController {
	
    @GetMapping("/serverTest")
    public  String dc(){
    	String services = "this is a server test!";
        return services;
    }
}
