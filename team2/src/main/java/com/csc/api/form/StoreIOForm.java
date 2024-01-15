package com.csc.api.form;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class StoreIOForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Size(max = 20) 
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
