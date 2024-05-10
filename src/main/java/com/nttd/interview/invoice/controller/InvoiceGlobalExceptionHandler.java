package com.nttd.interview.invoice.controller;

import com.nttd.interview.invoice.exception.InvoiceNotFoundException;
import com.nttd.interview.invoice.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class InvoiceGlobalExceptionHandler {
    @ExceptionHandler(InvoiceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(
            InvoiceNotFoundException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND, ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

}
