package com.csc.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.api.dao.AddMapper;
import com.csc.api.dto.StockAddSavedateRequest;
import com.csc.api.dto.StockAddUpdatedateRequest;

/*
 * author:フォン
 * date:2024/1/23
 */

@Service
public class StockAddService {

	@Autowired
	private AddMapper addMapper;// 從AddMapper生成實體並取名為addmapper

	// ↓新做一個變數addStockInfo然後代入Mapper所宣告的Save功能。
	public void addStockInfo(StockAddSavedateRequest stockAddSavedateRequest) {
		addMapper.save(stockAddSavedateRequest);
		// ↑調用新生成的實體addMapper裡的sava方法
	}

	public void addupdate(StockAddUpdatedateRequest stockAddUpdatedateRequest) {
		addMapper.update(stockAddUpdatedateRequest);
	}

}
