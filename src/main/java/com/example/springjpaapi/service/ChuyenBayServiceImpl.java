package com.example.springjpaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springjpaapi.entity.ChuyenBay;
import com.example.springjpaapi.repository.ChuyenBayRepository;

public class ChuyenBayServiceImpl implements ChuyenBayService {

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Override
	public List<ChuyenBay> timTatCa(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.timTatCa(gaDen);
	}

	@Override
	public List<ChuyenBay> chuyenBaySaiGonMeThuoc(String from, String to) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBaySGtoBMV("SGN", "BMV");
	}

	@Override
	public int chuyenBayTuSaiGon() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ChuyenBay> chuyenBayCuaAirbusA320() {
		// TODO Auto-generated method stub
		return null;
	}

}
