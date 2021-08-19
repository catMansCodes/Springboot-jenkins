package org.catmanscodes.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/home")
	public String homePage() {

		log.info("Called homePage()");

		return "Home page Welcome message";
	}
}
