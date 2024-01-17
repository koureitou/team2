package com.csc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.csc.api.dto.JsonResponse;
import com.csc.api.entity.StoreIOEntity;
import com.csc.api.form.StoreIOForm;
import com.csc.api.service.StoreIOService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/storeio")
public class StoreIOController {
	
	//private boolean isLoggedIn = true; // ログイン状態を管理する変数

	@Autowired
	private StoreIOService service;

	@PostMapping("/update")
	public JsonResponse<Void> updateStoreInfo(@Validated StoreIOForm inParam) throws Exception {

		service.updateStoreInfo(inParam);
		return new JsonResponse<>(200, "Update successful");

	}

	@PostMapping("/add")
	public JsonResponse<Integer> addStoreInfo(@Validated @RequestBody StoreIOForm inParam) throws Exception {

		int addok = service.addStoreInfo(inParam);
		return new JsonResponse<Integer>(200, addok);

	}
	//更新のDataを探す
	@PostMapping("/select")
	public JsonResponse<StoreIOEntity> selectStoreInfo(@Validated @RequestBody String productId)throws Exception  {

		return service.selectStoreById(productId);
	}
	
}
