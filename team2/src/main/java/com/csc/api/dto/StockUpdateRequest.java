package com.csc.api.dto;

import java.io.Serializable;

import lombok.Data;
/*
 * author: セツ
 * date:2024/1/17
 * 
*/


@Data
public class StockUpdateRequest extends StockAddRequest implements Serializable {

	private Integer id;

}
