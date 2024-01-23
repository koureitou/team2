package com.csc.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csc.api.dto.StockAddUpdataRequest;
import com.csc.api.dto.StockSearchRequest;

@Controller
public class AddController {
	
	//stocupdataView在庫更新．登録画面
	@GetMapping(value = "/Add")
	public String stocupdataView(Model model) {
		StockAddUpdataRequest add = new StockAddUpdataRequest();
		model.addAttribute("add2", add);
		return "Add"; 
	}
	
//	 @RequestMapping(value = "/Add/AddOKtest", method = RequestMethod.POST)
//	    public String AddOKtest(Model model) {
//	        String test = ;
//	        model.addAttribute("Addtest", test);
//	        return "AddOKtest";
//	    }

}

