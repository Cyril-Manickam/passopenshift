package com.passopenshift.passopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PassopenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassopenshiftApplication.class, args);
	}
	
	@GetMapping(value="/hello")
	public String sayHello() {
		return "Hello Open Shift";
	}
	
	@GetMapping(value="/helloagain/{hello}")
	public String sayHelloAgain(@PathVariable(required = true) String hello) {
		return "Hello " + hello;
	}

}
