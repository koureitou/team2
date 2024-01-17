package com.csc.api.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class StoreOutIOForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String inoutTypeId;
	private String inoutTypeName;
	private int documentNo;
	private int documentName;	
	private int productId;
	private String productName;	
	private String unitId;
	private String unit;	
	private String warehouseId;
	private String warehouseName;
	private double unitPrice;
	private int quantity;
	private double total;
	private String comm;
	private String delFlg;
	private String createDate;
	private String createUser;
	private String updateDate;
	private String updateUser;


}
