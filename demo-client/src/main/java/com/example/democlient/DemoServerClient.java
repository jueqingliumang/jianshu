package com.example.democlient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("demo-server")
public interface DemoServerClient {
    
	@GetMapping("/serverTest")
    String client();
	
}
