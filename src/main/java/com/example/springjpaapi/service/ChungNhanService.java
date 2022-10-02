package com.example.springjpaapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springjpaapi.entity.ChungNhan;

@Service
public interface ChungNhanService {
	List<String> findMMBtenHo(String name); 
	
	List<ChungNhan> findAll();
}
