package com.csc.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csc.api.dto.StockAddUpdataRequest;

@Controller
public class AddController {
	

	@GetMapping(value = "/Add")
	public String stocupdataView(Model model) {
		StockAddUpdataRequest add = new StockAddUpdataRequest();
		model.addAttribute("add2", add);
		return "Add"; 
	}

}

