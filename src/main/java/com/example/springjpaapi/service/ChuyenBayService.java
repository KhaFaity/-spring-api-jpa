package com.example.springjpaapi.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.springjpaapi.entity.ChuyenBay;

@Service
public interface ChuyenBayService {


	List<ChuyenBay> timTatCa(String gaDen);

	List<ChuyenBay> chuyenBayfrom10000to8000(int cond1, int cond2);

	List<ChuyenBay> chuyenBaySGtoBMV(String from, String to);
	
	List<ChuyenBay> soChuyenbaySG(String from);
	

}
