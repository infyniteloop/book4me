package com.infyniteloop.book4me.service;

import java.util.List;

import com.infyniteloop.book4me.model.Biodata;

public interface BiodataService {
	
	// CRUD operations
	public List<Biodata> listAll();
	public Biodata save(Biodata biodata);
	public Biodata get(Long id);
	public void delete(Long id);

}
