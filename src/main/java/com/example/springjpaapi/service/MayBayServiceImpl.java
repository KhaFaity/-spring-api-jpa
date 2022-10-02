package com.example.springjpaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springjpaapi.entity.MayBay;
import com.example.springjpaapi.repository.MayBayRepository;

public class MayBayServiceImpl implements MayBayService {
	@Autowired
	private MayBayRepository mayBayRepository;
	@Override
	public List<MayBay> findMayBayLon(int tambay) {
		// TODO Auto-generated method stub
		return mayBayRepository.findMayBayLon(10000);
	}

	@Override
	public List<MayBay> chuyenBayVN280(String maCB) {
		// TODO Auto-generated method stub
		return mayBayRepository.chuyenBayVN280("VN280");
	}

	@Override
	public List<Object> thongTinMoiLoaiMayBay() {
		// TODO Auto-generated method stub
		return mayBayRepository.thongTinMoiLoaiMayBay();
	}

}
