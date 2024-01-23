package com.csc.api.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class AddUpdataForm implements Serializable {
	                        //↑上面加了以後可以加速,加了以後變成另一個檔案implements Serializable
	private Integer id;
	private String name;
	private String unitId;
	private String remarks;
	private String createUser;
	private String updateUser;

}
