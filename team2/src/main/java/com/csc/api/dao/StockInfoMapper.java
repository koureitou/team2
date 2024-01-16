package com.csc.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.csc.api.dto.StockAddRequest;
import com.csc.api.dto.StockSearchRequest;
import com.csc.api.dto.StockUpdateRequest;
import com.csc.api.entity.StockInfo;



@Mapper
public interface StockInfoMapper {

	Integer getMaxId();

	List<StockInfo> findAll();

	/**
	 * ユーザー情報主キー検索
	 * 
	 * @param id 主キー
	 * @return 検索結果
	 */
	StockInfo findById(Integer id);

	/**
	 * ユーザー情報検索
	 * 
	 * @param user 検索用リクエストデータ
	 * @return 検索結果
	 */
	List<StockInfo> search(StockSearchRequest stock);

	/**
	 * ユーザー情報登録
	 * 
	 * @param userRequest 登録用リクエストデータ
	 */

	void save(StockAddRequest stockRequest);

	/**
	 * ユーザー情報更新
	 * 
	 * @param userUpdateRequest 更新用リクエストデータ
	 */
	void update(StockUpdateRequest stockUpdateRequest);

	/**
	 * ユーザー情報の論理削除
	 * 
	 * @param id ID
	 */
	void delete(Integer id);
}
