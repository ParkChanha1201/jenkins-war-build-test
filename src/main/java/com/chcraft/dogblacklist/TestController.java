package com.chcraft.dogblacklist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/goodbye")
	public String goodbye() {
		return "goodbye";
	}
}
