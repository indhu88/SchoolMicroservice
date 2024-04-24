package com.indhu.school.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.indhu.school.ApiResponse;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(Exception.class)
    public ApiResponse<?> handleException(Exception e) {
        return ApiResponse.ok(null, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse<?> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return ApiResponse.ok(null, errors.toString(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DuplicatedException.class)
    public ApiResponse<?> handleDuplicateIdException(DuplicatedException ex) {
        // Customize your error response
        return ApiResponse.ok(null, ex.getMessage(), HttpStatus.CONFLICT);
    }


}
