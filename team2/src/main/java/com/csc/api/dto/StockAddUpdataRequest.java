package com.csc.api.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


/*
 * author:フォン
 * date:2024/1/15
 */
@Data
public class StockAddUpdataRequest {
	
	@NotEmpty(message ="在庫商品IDを入力してください")
	@Size(max =6, message ="6桁以内の在庫商品IDを入力してください")
	private String stock_id;
	@Size(max =50, message ="50桁以内の在庫商品名称を入力できます。")
	private String neme;
	@Size(max =11, message ="6桁の単位IDを入力できます。")
	private String unit_id;
	@Size(max =200, message ="200桁以内の備考を入力できます。")
	private String remarks;
}
