package com.csc.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.csc.api.dto.StockAddSavedateRequest;
import com.csc.api.dto.StockAddUpdatedateRequest;


/*
 * author:フォン
 * data :2024/01/23
 */
//這裡宣告的變數的邏輯都來自XML檔案裡的SQL文文法。

@Mapper
public interface AddMapper {
	
	Integer getMaxId();
			
	void save(StockAddSavedateRequest stockAddSavedateRequest);//
		//↑這裡的sava規則來自XML的變數所以必須與XML做綁定依樣。
		//↑新規商品の情報を登録する登録ボタン機能の変数宣言。
	void update(StockAddUpdatedateRequest stockAddUpdatedateRequest);
		//↑新建的update的Request必須要跟sava做的Request分開因為XML規則不一樣
		//↑既にある商品の情報を更新する機能の変数宣言。

	
}
