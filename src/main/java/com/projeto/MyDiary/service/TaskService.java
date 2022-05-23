package com.projeto.MyDiary.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.projeto.MyDiary.dao.TaskDAO;
import com.projeto.MyDiary.model.Task;

public class TaskService {
	
	@Autowired
	TaskDAO tdao;
	
	public Map<String, Object> countTask() {
		return tdao.countTasks();
	}
	
	public void addTask(Task t) {
		tdao.addTask(t);
	}
	
	public List<Map<String, Object>> getTasks() {
		return tdao.getTasks();
	}
	
	public void deleteTask(int id) {
		tdao.deleteTask(id);
	}
}
