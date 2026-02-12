package com.twg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.springboot.entity.Entry;
import com.twg.springboot.repository.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryRepository entryRepository;
	@Override
	public void save(Entry entry) {
		entryRepository.save(entry);

	}

	@Override
	public void update(Entry entry) {
		entryRepository.save(entry);

	}

	@Override
	public void delete(Entry entry) {
		
		entryRepository.delete(entry);

	}

	@Override
	public Entry findById(int id) {
		
		return entryRepository.findById(id).orElse(null);
	}

	@Override
	public List<Entry> findAll() {
		
		return entryRepository.findAll();
	}

	@Override
	public List<Entry> findByUserId(int id) {
		
		return entryRepository.findByUserId(id);
	}

}
