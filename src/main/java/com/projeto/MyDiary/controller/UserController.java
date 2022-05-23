package com.projeto.MyDiary.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.MyDiary.model.User;
import com.projeto.MyDiary.service.UserService;

@Controller
@ComponentScan("com.projeto.MyDiary.model")
public class UserController {
	
	@Autowired 
	private ApplicationContext context;
	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("user", new User(0,"","",""));
		return "form-user";
	}
	
	@PostMapping("/form")
	public String addUser(@ModelAttribute User user, Model model) {
		UserService us = context.getBean(UserService.class);
		us.addUser(user);
		return "success";
	}
}
