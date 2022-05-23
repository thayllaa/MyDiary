package com.projeto.MyDiary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contact-us")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/about-us")
	public String about() {
		return "about";
	}
	
	@GetMapping("/error")
	public String error() {
		return "error";
	}
}
