package com.csc.api.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.csc.api.dto.JsonResponse;
import com.csc.api.exception.CreateFaildException;
import com.csc.api.exception.NameConflictException;
import com.csc.api.exception.ServiceException;

@RestControllerAdvice
public class StoreExceptionAdvice {

	@ExceptionHandler(ServiceException.class)
	public JsonResponse<Void> handleServiceException(Throwable error) {

		JsonResponse<Void> response = new JsonResponse<>(error);

		if (error instanceof CreateFaildException) {
			response.setStatus(-100);
			response.setMessage("err_100");
		} else if (error instanceof NameConflictException) {
			response.setStatus(-101);
			response.setMessage("err_101");
		}

		return response;
	}
}
