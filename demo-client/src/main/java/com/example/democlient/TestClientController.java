package com.example.democlient;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClientController {
	
	@Autowired
    DemoServerClient demoServerClient;
	
    @GetMapping("/clientTest")
    public String clientTest(){
        return "从client 调到 server ："+demoServerClient.client();
    }
}
