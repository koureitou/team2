package com.csc.api.entity;
/*
 * author:フォン
 * data:2024 01/10
 */
import java.util.Date;

import lombok.Data;

@Data
public class StockAddInformetion {

	private String stockId;//在庫商品ID
	
	private String stockname;//在庫商品名称

	private String unitid;//単位ID

	private String stocknum;//在庫数量

	private String remarks; //備考

	private String delflg;//削除フラグ

	private String createdata;//作成日時

	private Integer createuser;//作成ID

	private String updatedate;//更新日時

	private Date updateuser;//更新者ID

	private Date version;//楽観鎖

}
