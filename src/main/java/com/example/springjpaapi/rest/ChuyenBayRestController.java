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
	private ChuyenBayService chueyBayService;
	@GetMapping("/chuyenbays/{ga}")
	public List<ChuyenBay> findAllDLA(@PathVariable String ga) throws Exception{
		
		return chueyBayService.timTatCa(ga);
	}

}
