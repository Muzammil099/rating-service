package com.practice.user.service.exceptions;

import com.practice.user.service.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFound(ResourceNotFoundException ex){

        return new ResponseEntity<ApiResponse>(
            ApiResponse.builder()
                .message(ex.getMessage())
                .success(false)
                .status(HttpStatus.NOT_FOUND)
                .build(),
            HttpStatus.NOT_FOUND
        );
    }
}
