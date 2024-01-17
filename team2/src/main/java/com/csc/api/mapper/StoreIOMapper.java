package com.csc.api.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.csc.api.dto.JsonResponse;
import com.csc.api.entity.StoreIOEntity;
import com.csc.api.form.StoreIOForm;
import com.csc.api.form.StoreOutIOForm;

@Mapper
public interface StoreIOMapper {

	int addStoreIO(StoreIOForm form);

	void updateStoreIO(StoreIOForm form);

	StoreOutIOForm selectStoreIO(StoreIOForm form);
	
	StoreOutIOForm selectMaxId(StoreIOForm form);

	JsonResponse<StoreIOEntity> selectStoreById(String productId);
	
	


}
