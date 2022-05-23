package com.projeto.MyDiary.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.projeto.MyDiary.model.Task;

public class TaskDAO {
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	private void initialize() {
		jdbc = new JdbcTemplate(dataSource);
	}
	
	public Map<String, Object> countTasks() {
		String sql = "SELECT COUNT(*) AS c FROM tasks";
		return jdbc.queryForMap(sql);
	}
	
	public void addTask(Task task) {
		String sql = "INSERT INTO tasks(name, category, start, finish, details)"
				+ "VALUES(?,?,?,?,?)";
		
		Object[] obj = new Object[5];
		
		obj[1] = task.getName();
		obj[2] = task.getCategory();
		obj[3] = task.getStart();
		obj[4] = task.getFinish();
		obj[5] = task.getDescription();
		
		jdbc.update(sql, obj);
	}
	
	public List<Map<String, Object>> getTasks() {
		String sql = "SELECT * FROM Tasks";
		List<Map<String, Object>> tasks = (List<Map<String, Object>>) jdbc.queryForList(sql);
		return tasks;
	}
	
	public void deleteTask(int id) {
		String sql = "DELETE FROM tasks WHERE id = ?";
		
		Object[] obj = new Object[1];
		
		obj[0] = id;
		
		jdbc.update(sql, obj);
	}
}
