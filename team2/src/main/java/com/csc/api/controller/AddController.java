package com.csc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csc.api.dto.StockAddSavedateRequest;
import com.csc.api.dto.StockAddUpdatedateRequest;
import com.csc.api.dto.StockSearchRequest;
import com.csc.api.entity.StockInfo;
import com.csc.api.service.StockAddService;
import com.csc.api.service.StockInfoService;

@Controller
public class AddController {
	
	@Autowired
	private StockAddService stockAddService;
	@Autowired
	private StockInfoService stockInfoService;
	
	//stocupdataView在庫更新．登録画面
	@GetMapping(value = "/Add")
	public String stocupdataView(Model model,StockAddSavedateRequest stockAddSavedateRequest) {
		stockAddSavedateRequest.setId(stockInfoService.getMaxId());
		model.addAttribute("btn","登録");
		return "AddScreen";
	}
	//在庫情報画面一覧の編集ボタンの遷移先とボタン機能の設定
	@GetMapping(value = "/stock/{id}/edit")
	public String stocupdataView2(@PathVariable Integer id, Model model,StockAddSavedateRequest stockAddSavedateRequest) {
		StockInfo stock = stockInfoService.findById(id);
		stockAddSavedateRequest.setId(stock.getId());
		stockAddSavedateRequest.setName(stock.getName());
		stockAddSavedateRequest.setUnitId(stock.getUnitId());
		stockAddSavedateRequest.setRemarks(stock.getRemarks());
		model.addAttribute("btn","更新");
		return "AddScreen";
	}
	
	//登録機能の宣言とクラスの代入
	@PostMapping(value = "/insert") //
	public String AddSave(Model model,StockAddSavedateRequest stockAddSaveUpdateRequest) {
		stockAddService.addStockInfo(stockAddSaveUpdateRequest);
        return "redirect:/stock/list";//遷移したい画面の先 セツさんが作った画面
	}
	
	//更新機能の宣言とクラスの代入
	@PostMapping(value = "/update") //
	public String Addupdate(Model model,StockAddUpdatedateRequest stockAddUpdatedateRequest) {
		stockAddService.addupdate(stockAddUpdatedateRequest);
        return "redirect:/stock/list";//遷移したい画面の先 セツさんが作った画面
	}
	


}

