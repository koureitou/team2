package com.csc.api.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.csc.api.form.StoreIOForm;
import com.csc.api.mapper.StoreIOMapper;


@Repository
public class StoreIoDao {
	
	@Autowired	
	StoreIOMapper stmapper;
	
	public int addStoreIO(StoreIOForm form) {
		int result = stmapper.addStoreIO(form);
		return result;
	}
	public void updateStoreIO(StoreIOForm form) {
		stmapper.updateStoreIO(form);
		
	}
}
