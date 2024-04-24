package com.indhu.school;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
	
	  private HttpStatus status;
	    private String message;
	    private T data;
	    private ApiResponse(T data,String message,HttpStatus status) {
	        this.status = status;
	        this.data = data;
	        this.message=message;
	    }
	    public static  <T> ApiResponse<T> ok(T data,String message,HttpStatus status) {
	        return new ApiResponse<>(data,message,status);
	    }

}
