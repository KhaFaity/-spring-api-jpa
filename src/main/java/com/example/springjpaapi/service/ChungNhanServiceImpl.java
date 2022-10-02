package com.example.springjpaapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjpaapi.entity.ChungNhan;
import com.example.springjpaapi.repository.ChungNhanRepository;

@Service
@Transactional
public class ChungNhanServiceImpl implements ChungNhanService {

	@Autowired
	private ChungNhanRepository chungNhanRepository;
	
	
	@Override
	public List<String> findMMBtenHo(String name) {
		// TODO Auto-generated method stub
		return chungNhanRepository.findMMBtenHo("Nguyễn");
	}

	@Override
	public List<ChungNhan> findAll() {
		// TODO Auto-generated method stub
		return chungNhanRepository.findAll();
	}
	
	
}
