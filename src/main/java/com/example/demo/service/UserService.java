package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userrepo;

	public Integer save(User user) {
		// TODO Auto-generated method stub
		Integer userid=userrepo.save(user).getId();
		return userid;
	}

}
