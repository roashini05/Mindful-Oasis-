package com.example.mindful_oasis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mindful_oasis.model.User;
import com.example.mindful_oasis.repository.UserRepo;

@Service
public class UserService {
    
    @Autowired
	UserRepo sur;
	public User postData(User data) {

		return sur.save(data); 
	}

}
