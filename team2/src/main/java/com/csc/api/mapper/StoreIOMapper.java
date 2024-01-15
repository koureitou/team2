package com.csc.api.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.csc.api.form.StoreIOForm;

@Mapper
public interface StoreIOMapper {

	int addStoreIO(StoreIOForm form);

	void updateStoreIO(StoreIOForm form);
	
	


}
