package com.csc.api.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class StockAddRequest implements Serializable{

	private Integer id;
	
	private String name;
	
	private String unitId;
	
	private String remarks;
	
	private Integer delFlg;

	private Date createDate;

	private String createUser;
	
	private Integer stockNum;
	
	private String loginUser;
	
	private Date updateDate;
}
