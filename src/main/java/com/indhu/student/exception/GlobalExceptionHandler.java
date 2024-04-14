package com.indhu.student.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(Exception e) {
        return "An error occurred: " + e.getMessage();
    }


}
