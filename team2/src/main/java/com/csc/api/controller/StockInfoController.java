package com.csc.api.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csc.api.dto.StockAddRequest;
import com.csc.api.dto.StockSearchRequest;
import com.csc.api.dto.StockUpdateRequest;
import com.csc.api.entity.StockInfo;
import com.csc.api.service.StockInfoService;

/*
 * author: セツ
 * date:2024/1/17
 * 
*/




@Controller
public class StockInfoController {
	

	@Autowired
    private StockInfoService stockInfoService;
	
    @GetMapping(value = "/stock/list")
    public String displayList(Model model) {
        List<StockInfo> stockList = stockInfoService.findAll();
        model.addAttribute("stocklist", stockList);
        model.addAttribute("stockSearchRequest", new StockSearchRequest());
        return "stock/search";
    }
	
	 @GetMapping(value = "/stock/add")
	 public String displayAdd(Model model,StockAddRequest stockAddRequest) {
		 stockAddRequest.setId(stockInfoService.getMaxId());
		 
	        model.addAttribute("stockAddRequest",stockAddRequest );
	        return "stock/add";
	    
	    }
	 
	 @GetMapping("/stock/{id}/edit")
	    public String displayEdit(@PathVariable Integer id, Model model) {
		 StockInfo stock = stockInfoService.findById(id);
		 StockUpdateRequest stockUpdateRequest = new StockUpdateRequest();
		 stockUpdateRequest.setId(stock.getId());
		 stockUpdateRequest.setName(stock.getName());
		 stockUpdateRequest.setUnitId(stock.getUnitId());
		 stockUpdateRequest.setRemarks(stock.getRemarks());
	        
	        model.addAttribute("stockUpdateRequest", stockUpdateRequest);
	        return "stock/edit";
	    }	 
	 
	 @GetMapping("/stock/{id}/delete")
	    public String delete(@PathVariable Integer id, Model model) {
	        // ユーザー情報の削除
		 stockInfoService.delete(id);
	        return "redirect:/stock/list";
	 }
	 
	 @RequestMapping(value = "/stock/search", method = RequestMethod.POST)
	    public String search(@ModelAttribute StockSearchRequest stockSearchRequest, Model model) {
	        List<StockInfo> stockList = stockInfoService.search(stockSearchRequest);
	        model.addAttribute("stocklist", stockList);
	        return "stock/search";
	    }
	 
	 
	 @RequestMapping(value = "/stock/create", method = RequestMethod.POST)
	    public String create(@Validated @ModelAttribute StockAddRequest stockRequest, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	          
	            List<String> errorList = new ArrayList<String>();
	            for (ObjectError error : result.getAllErrors()) {
	                errorList.add(error.getDefaultMessage());
	            }
	            model.addAttribute("validationError", errorList);
	            return "stock/add";
	        }
	        
	        
	        
	        stockInfoService.save(stockRequest);
	        return "redirect:/stock/list";
	    }	 
	 
	  @RequestMapping(value = "/stock/update", method = RequestMethod.POST)
	    public String update(@Validated @ModelAttribute StockUpdateRequest stockUpdateRequest, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            List<String> errorList = new ArrayList<String>();
	            for (ObjectError error : result.getAllErrors()) {
	                errorList.add(error.getDefaultMessage());
	            }
	            model.addAttribute("validationError", errorList);
	            return "stock/edit";
	        }
	 
	        stockInfoService.update(stockUpdateRequest);
	        return "redirect:/stock/list";
	    }	 
	

}
