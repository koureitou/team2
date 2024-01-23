package com.csc.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.csc.api.form.AddUpdataForm;


/*
 * author:フォン
 * data :2024/01/23
 */

@Mapper
public interface AddMapper {
	
	Integer getMaxId();
	
	void save(AddUpdataForm form);//
		//↑sava與XML的變數必須做綁定
	

	
}
