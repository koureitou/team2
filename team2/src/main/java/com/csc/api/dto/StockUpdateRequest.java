package com.csc.api.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StockUpdateRequest extends StockAddRequest implements Serializable {

	private Integer id;

}
