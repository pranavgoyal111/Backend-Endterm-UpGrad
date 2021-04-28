package com.example.EndTerm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EndTerm.model.User;
import com.example.EndTerm.repository.UserRepository;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
@Override
public List<User> getAllUser(){
	return userRepository.findAll();
}
}
