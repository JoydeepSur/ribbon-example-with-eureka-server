package com.example.ribbon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon/eureka/server")
public class HelloController {
	@Value("${server.port}")
	private String port;

	@GetMapping
	public String getHello() {
		return "Hello everyone!! from Port :" + port;
	}
}
