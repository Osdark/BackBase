package com.zeroim.util;

import com.zeroim.requests.util.ResError;
import com.zeroim.requests.util.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Response<String>> handleException(Exception e) {
        Response<String> response = new Response<>();
        response.setData("Exception");
        response.setError(new ResError(404, "Not found"));
        return ResponseEntity.badRequest().body(response);
    }
}
