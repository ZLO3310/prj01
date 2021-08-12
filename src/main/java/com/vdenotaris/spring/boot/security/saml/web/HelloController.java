package com.vdenotaris.spring.boot.security.saml.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/mytest")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}