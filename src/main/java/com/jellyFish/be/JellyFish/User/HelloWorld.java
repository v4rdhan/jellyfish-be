package com.jellyFish.be.JellyFish.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String helloWorld() {
		return "Hello World!";
	}

}
