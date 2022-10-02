package com.example.springjpaapi.service;

import java.util.List;

import com.example.springjpaapi.entity.NhanVien;

public interface NhanVienService {
	public List<NhanVien> nhanVienLuongnho10000(int luong);
	public int tongLuongNhanVien();
	public List<String> maNVMBBoeing(String loai);
	public List<NhanVien> nhanVienMB747(String mb);
	public List<String> maNVBoeingAirbus(String mb1, String mb2);
	public List<String> tenNVBoeing(String loai);
}
