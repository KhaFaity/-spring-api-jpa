package com.example.springjpaapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springjpaapi.entity.ChuyenBay;

@Service
public interface ChuyenBayService {
	public List<ChuyenBay> timTatCa(String gaDen);
	public List<ChuyenBay> chuyenBaySaiGonMeThuoc(String from, String to);
	public int chuyenBayTuSaiGon();
	public List<ChuyenBay> chuyenBayCuaAirbusA320 ();

}
