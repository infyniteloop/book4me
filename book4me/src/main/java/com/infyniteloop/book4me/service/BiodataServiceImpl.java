package com.infyniteloop.book4me.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infyniteloop.book4me.dao.BiodataDao;
import com.infyniteloop.book4me.model.Biodata;

@Service
public class BiodataServiceImpl implements BiodataService {
	
	@Autowired
	private BiodataDao biodataDao;

	@Override
	public List<Biodata> listAll() {
		return biodataDao.findAll();
	}

	@Override
	public Biodata save(Biodata biodata) {
		return biodataDao.save(biodata);
	}

	@Override
	public Biodata get(Long id) {
		return biodataDao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		biodataDao.deleteById(id);
	}

}
