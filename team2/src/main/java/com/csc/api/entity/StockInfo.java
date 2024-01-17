package com.csc.api.entity;

import java.sql.Date;

import lombok.Data;
/*
 * author: セツ
 * date:2024/1/17
 * 
*/

@Data
public class StockInfo {

	private Integer id;

	private String name;

	private String unitId;

	private String remarks;

	private Integer delFlg;

	private Date createDate;

	private String createUser;

	private String userName;

	private String updateUser;

	private Date updateDate;
	
	private Integer stockNum;
	
	private String loginUser;
	
	private String codeName;
}
