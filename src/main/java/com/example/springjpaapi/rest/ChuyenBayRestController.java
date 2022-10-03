package com.example.springjpaapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpaapi.entity.ChuyenBay;
import com.example.springjpaapi.service.ChuyenBayService;


@RestController
@RequestMapping("/api")
public class ChuyenBayRestController {
@Autowired
	private ChuyenBayService cbService;
	
	@GetMapping("/chuyenbay/timTatCaDAD")
	public List<ChuyenBay> timTatCaDAD() throws Exception{
		
		return cbService.timTatCa("DAD");
	}
	@GetMapping("/chuyenbay/findChuyenBaySGtoBMV")
	public List<ChuyenBay> findChuyenBaySGtoBMV() throws Exception{
		return cbService.chuyenBaySGtoBMV("SGN","BMV");
	}
	
	@GetMapping("/chuyenbay/findSoChuyenbaySG")
	public List<ChuyenBay> findSoChuyenbaySG() throws Exception{
		return cbService.soChuyenbaySG("SGN");
	}
	
	@GetMapping("/chuyenbay/findChuyenBayfrom10000to8000")
	public List<ChuyenBay> findChuyenBayfrom10000to8000() throws Exception{
		return cbService.chuyenBayfrom10000to8000(10000, 8000);
	}
}
