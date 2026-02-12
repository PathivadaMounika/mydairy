package com.twg.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.twg.springboot.entity.Entry;

public interface EntryRepository extends JpaRepository<Entry, Integer> {
	 @Query(
		        value = "SELECT * FROM entries WHERE userid = :id",
		        nativeQuery = true
		    )
	  public List<Entry> findByUserId(int id);
}
