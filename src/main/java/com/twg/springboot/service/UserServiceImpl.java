package com.twg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.springboot.entity.User;
import com.twg.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public void save(User user) {
		userRepository.save(user);

	}

	@Override
	public void update(User user) {
		userRepository.save(user);

	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);

	}

	@Override
	public User findById(int id) {
		
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

	@Override
	public User findByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

}
