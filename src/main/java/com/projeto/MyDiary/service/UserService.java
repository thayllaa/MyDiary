package com.projeto.MyDiary.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.projeto.MyDiary.dao.UserDAO;
import com.projeto.MyDiary.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDAO udao;
	
	public void addUser(User u) {
		udao.addUser(u);
	}
}
