package com.projeto.MyDiary.dao;

import javax.annotation.PostConstruct; 
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.projeto.MyDiary.model.User;

@Repository
public class UserDAO {
	
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	private void initialize() {
		jdbc = new JdbcTemplate(dataSource);
	}
	
	public void addUser(User user) {
		String sql = "INSERT INTO users(name, email, password)"
				+ "VALUES (?,?,?)";
		
		Object[] obj = new Object[3];
		
		obj[0] = user.getName();
		obj[2] = user.getEmail();
		obj[3] = user.getPassword();
		
		jdbc.update(sql, obj);
	}
}
