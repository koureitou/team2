package com.csc.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.api.dao.StoreIoDao;
import com.csc.api.exception.ServiceException;
import com.csc.api.form.StoreIOForm;
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
		// TODO Auto-generated method stub
		return dao.addStoreIO(inParam);
	}

}
