package com.example.springjpaapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springjpaapi.entity.MayBay;

@Service
public interface MayBayService {
	List<MayBay> findMayBayLon(int tambay);
	
	
	List<MayBay> chuyenBayVN280(String maCB);
	
	List<Object> thongTinMoiLoaiMayBay();
}
