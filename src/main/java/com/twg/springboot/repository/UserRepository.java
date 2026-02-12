package com.twg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.twg.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(
        value = "SELECT * FROM users WHERE username = :username LIMIT 1",
        nativeQuery = true
    )
	public User findByUsername(String username);
	
}
