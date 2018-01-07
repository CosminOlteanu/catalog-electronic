package com.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RouteController {

	@GetMapping("/catalog")
	public String Home(){
		return "catalog";
	}
}
