package com.twg.springboot.service;

import java.util.List;

import com.twg.springboot.entity.Entry;


public interface EntryService {
	   public void save(Entry entry);
	   public void update(Entry entry);
	   public void delete(Entry entry);
	   public Entry findById(int id);
	   public List<Entry> findAll();
	   public List<Entry> findByUserId(int id);
}
