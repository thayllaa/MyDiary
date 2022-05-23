package com.projeto.MyDiary.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.MyDiary.model.Task;
import com.projeto.MyDiary.service.TaskService;

@Controller 
@ComponentScan("com.projeto.MyDiary.model")
public class TaskController {
	
	@Autowired
	private ApplicationContext context;
	
	@GetMapping("/add-task")
	public String addTask(Model model) {
		model.addAttribute("task", new Task(0,"","","","",""));
		return "form-task";
	}
	
	@PostMapping("/add-task")
	public String addTask(@ModelAttribute Task task, Model model) {
		TaskService ts = context.getBean(TaskService.class);
		ts.addTask(task);
		return "success2";
	}
}
