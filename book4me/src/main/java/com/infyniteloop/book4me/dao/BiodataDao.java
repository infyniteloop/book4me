package com.infyniteloop.book4me.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infyniteloop.book4me.model.Biodata;

public interface BiodataDao extends JpaRepository<Biodata, Long>{
	
	

}
