package com.csc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.csc.api.form.StoreIOForm;
import com.csc.api.service.StoreIOService;
import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/storeio")
public class StoreIOController {
	
	@Autowired
    private StoreIOService service;
	
	@PostMapping("/update")
	public ResponseEntity<?> updateStoreInfo(@Validated @RequestBody  StoreIOForm inParam ,BindingResult bindingResult) throws Exception {

		if (bindingResult.hasErrors()) {
            
            StringBuilder errorMessage = new StringBuilder("Validation failed: ");
            for (FieldError error : bindingResult.getFieldErrors()) {
                errorMessage.append(error.getDefaultMessage()).append("; ");
            }
            return ResponseEntity.badRequest().body(errorMessage.toString());
        }

        try {
        	service.updateCustomInfo(inParam);
            return ResponseEntity.ok("Update successful");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Business logic error: " + e.getMessage());
        }
    }
	@PostMapping("/entry")
	public ResponseEntity<Integer> addStoreInfo(@Validated @RequestBody  StoreIOForm inParam ,BindingResult bindingResult) throws Exception {

		if (bindingResult.hasErrors()) {
            
            StringBuilder errorMessage = new StringBuilder("Validation failed: ");
            for (FieldError error : bindingResult.getFieldErrors()) {
                errorMessage.append(error.getDefaultMessage()).append("; ");
            }
            return ResponseEntity.badRequest().body(1);
        }

        try {
        	 int addok = service.addCustomInfo(inParam);
            return ResponseEntity.ok(addok);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(0);
        }
    }
		
}
		

