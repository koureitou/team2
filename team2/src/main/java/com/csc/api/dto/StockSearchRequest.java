package com.csc.api.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class StockSearchRequest implements Serializable {

	private String name;
	
	private String unitId;
	
	private  Date updateDate;
	
	private String startDate;
	private String endDate;
}
