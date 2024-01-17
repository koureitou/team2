package com.csc.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.api.dao.StockInfoMapper;
import com.csc.api.dto.StockAddRequest;
import com.csc.api.dto.StockSearchRequest;
import com.csc.api.dto.StockUpdateRequest;
import com.csc.api.entity.StockInfo;

/*
 * author: セツ
 * date:2024/1/17
 * 
*/


@Service
public class StockInfoService {

	 @Autowired
	    private StockInfoMapper stockInfoMapper;
	    
	    public Integer getMaxId() {
			return stockInfoMapper.getMaxId();
		}
	  
	    public List<StockInfo> findAll() {
	        return stockInfoMapper.findAll();
	    }
	   
	    public StockInfo findById(Integer id) {
	        return stockInfoMapper.findById(id);
	    }
	    
	    public List<StockInfo> search(StockSearchRequest stockSearchRequest) {
	        return stockInfoMapper.search(stockSearchRequest);
	    }
	  
	    public void save(StockAddRequest stockAddRequest) {
	    	stockInfoMapper.save(stockAddRequest);
	    }
	  
	    public void update(StockUpdateRequest stockUpdateRequest) {
	    	stockInfoMapper.update(stockUpdateRequest);
	    }
	   
	    public void delete(Integer id) {
	    	stockInfoMapper.delete(id);
	    }
}
