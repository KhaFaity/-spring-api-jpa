package com.example.springjpaapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpaapi.entity.ChungNhan;
import com.example.springjpaapi.service.ChungNhanService;


@RestController
@RequestMapping("/api")
public class ChungNhanRestController {
	
	@Autowired
	private ChungNhanService chungNhanService;
	
	@GetMapping("/chungnhan/ma-ho-nguyen")
	public List<String> maMBVoiNVHoNguyen(){
		List<String> ls = chungNhanService.findMMBtenHo("Nguyễn");
		
		return ls;
	}
	@GetMapping("/chungnhans")
	public List<ChungNhan> findAll(){
		List<ChungNhan> ls = chungNhanService.findAll();
		
		return ls;
	}
}
