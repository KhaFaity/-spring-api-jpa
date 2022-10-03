package com.example.springjpaapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjpaapi.entity.ChuyenBay;
import com.example.springjpaapi.repository.ChuyenBayRepository;
@Service
@Transactional
public class ChuyenBayServiceImpl implements ChuyenBayService {

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;

	@Override
	public List<ChuyenBay> timTatCa(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.timTatCa(gaDen);
	}

	@Override
	public List<ChuyenBay> chuyenBaySGtoBMV(String from, String to) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBaySGtoBMV(from, to);
	}

	@Override
	public List<ChuyenBay> chuyenBayfrom10000to8000(int cond1, int cond2) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBayfrom10000to8000(cond1, cond2);
	}

	@Override
	public List<ChuyenBay> soChuyenbaySG(String from) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.soChuyenbaySG(from);
	}


	

	

}
