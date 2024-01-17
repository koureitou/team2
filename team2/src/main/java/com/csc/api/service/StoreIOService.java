package com.csc.api.service;

import com.csc.api.form.StoreOutIOForm;
import com.csc.api.dto.JsonResponse;
import com.csc.api.entity.StoreIOEntity;
import com.csc.api.exception.ServiceException;
import com.csc.api.form.StoreIOForm;


public interface StoreIOService {

	public void updateStoreInfo(StoreIOForm inParam) throws ServiceException;

	public int addStoreInfo(StoreIOForm inParam) throws ServiceException;
	
	public StoreOutIOForm selectMaxId(StoreIOForm inParam)throws ServiceException;

	public JsonResponse<StoreIOEntity> selectStoreById(String productId); 

}
