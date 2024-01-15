package com.csc.api.service;

import com.csc.api.exception.ServiceException;
import com.csc.api.form.StoreIOForm;


public interface StoreIOService {

	public void updateStoreInfo(StoreIOForm inParam) throws ServiceException;

	public int addStoreInfo(StoreIOForm inParam) throws ServiceException;

}
