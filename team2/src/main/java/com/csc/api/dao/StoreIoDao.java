package com.csc.api.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.csc.api.dto.JsonResponse;
import com.csc.api.entity.StoreIOEntity;
import com.csc.api.form.StoreIOForm;
import com.csc.api.form.StoreOutIOForm;
import com.csc.api.mapper.StoreIOMapper;
/**
 * @author:侯麗冬
 * @create:2024/01/11
 * @Description:入出庫情報Dao
 * @FileName:StoreIoDao
 * @History:
 * @その他の内容:
 **/

@Repository
public class StoreIoDao {
	
	@Autowired	
	StoreIOMapper stmapper;
	
	/*入出庫情報追加
	*@param form
	*@return 
	*/
	public int addStoreIO(StoreIOForm form) {
		int result = stmapper.addStoreIO(form);
		return result;
	}
	/*入出庫情報更新
	*@param form
	*@return 
	*/
	public void updateStoreIO(StoreIOForm form) {
		stmapper.updateStoreIO(form);	
	}
	/*入出庫情報更新画面初期表示
	*@param form
	*@return 
	*/
	public JsonResponse<StoreIOEntity> selectStoreById(String productId) {
		return stmapper.selectStoreById(productId);
	}
	/*入出庫情報追加画面初期表示
	*@param form
	*@return 
	*/
	public StoreOutIOForm selectMaxId(StoreIOForm form) {
		return stmapper.selectMaxId(form);
	}
	
	
}
