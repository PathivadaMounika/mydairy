package com.twg.springboot.service;

import java.util.List;

import com.twg.springboot.entity.User;

public interface UserService {
	  public void save(User user);
	   public void update(User user);
	   public void delete(User user);
	   public User findById(int id);
	   public List<User> findAll();
	   public User findByUsername(String username);
}
