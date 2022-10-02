package com.example.springjpaapi.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.example.springjpaapi.entity.NhanVien;
import com.example.springjpaapi.repository.NhanVienRepository;

public class NhanVienServiceImpl implements NhanVienRepository {

	@Override
	public List<NhanVien> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NhanVien> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NhanVien> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NhanVien> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends NhanVien> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NhanVien> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<NhanVien> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NhanVien getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NhanVien getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NhanVien getReferenceById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NhanVien> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NhanVien> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<NhanVien> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NhanVien> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<NhanVien> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(NhanVien entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends NhanVien> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends NhanVien> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends NhanVien> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NhanVien> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends NhanVien> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends NhanVien, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NhanVien> nhanVienLuongnho10000(int luong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int tongLuongNhanVien() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> maNVMBBoeing(String loai) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NhanVien> nhanVienMB747(String mb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> maNVBoeingAirbus(String mb1, String mb2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> tenNVBoeing(String loai) {
		// TODO Auto-generated method stub
		return null;
	}

}
