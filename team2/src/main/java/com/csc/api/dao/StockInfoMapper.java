package com.csc.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.csc.api.dto.StockAddRequest;
import com.csc.api.dto.StockSearchRequest;
import com.csc.api.dto.StockUpdateRequest;
import com.csc.api.entity.StockInfo;


/*
 * author: セツ
 * date:2024/1/17
 * 
*/

@Mapper
public interface StockInfoMapper {

	Integer getMaxId();

	List<StockInfo> findAll();


	StockInfo findById(Integer id);

	List<StockInfo> search(StockSearchRequest stock);

	void save(StockAddRequest stockRequest);

	void update(StockUpdateRequest stockUpdateRequest);

	void delete(Integer id);
}
