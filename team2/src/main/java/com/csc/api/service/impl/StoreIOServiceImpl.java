package com.csc.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csc.api.dao.StoreIoDao;
import com.csc.api.dto.JsonResponse;
import com.csc.api.entity.StoreIOEntity;
import com.csc.api.exception.ServiceException;
import com.csc.api.form.StoreIOForm;
import com.csc.api.form.StoreOutIOForm;
import com.csc.api.service.StoreIOService;

@Service
public class StoreIOServiceImpl implements StoreIOService{
	
	@Autowired
	StoreIoDao dao;

	@Override
	public void updateStoreInfo(StoreIOForm inParam) throws ServiceException {
		dao.updateStoreIO(inParam);
		
	}

	@Override
	public int addStoreInfo(StoreIOForm inParam) throws ServiceException {
	
		return dao.addStoreIO(inParam);
	}

	@Override
	public JsonResponse<StoreIOEntity> selectStoreById(String productId) throws ServiceException{
		
		return dao.selectStoreById(productId);
	}

	@Override
	public StoreOutIOForm selectMaxId(StoreIOForm inParam) throws ServiceException {
		
		return dao.selectMaxId(inParam);
	}

	

	

}
