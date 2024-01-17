package com.csc.api.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
/**
 * @author:侯麗冬
 * @create:2024/01/11
 * @Description:t_stork_io
 * @FileName:StoreIOEntity
 * @History:
 * @その他の内容:
 **/

@Data
public class StoreIOEntity {


	@Size(max = 20,message="err") 
	@NotEmpty(message = "this field can not be empty")
	private String inoutTypeId;
	@Size(max = 9)
	@NotEmpty(message = "this field can not be empty")
	private int documentNo;
	@Size(max = 9)
	@NotEmpty(message = "this field can not be empty")
	private int productId;
	@Size(max = 9)
	@NotEmpty(message = "this field can not be empty")
	private String productName;
	@Size(max = 9)
	@NotEmpty(message = "this field can not be empty")
	private String unitId;
	@Size(max = 9)
	@NotEmpty(message = "this field can not be empty")
	private String warehouseId;
	@NotEmpty(message = "this field can not be empty")
	@Size(max = 9)
	private double unitPrice;
	@NotEmpty(message = "this field can not be empty")
	private int quantity;
	private double total;
	private String comm;
	private String delFlg;
	private String createDate;
	private String createUser;
	private String updateDate;
	private String updateUser;

}
