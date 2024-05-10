package com.nttd.interview.invoice.exception;

public class InvoiceNotFoundException extends RuntimeException {
    public InvoiceNotFoundException(String errorMessage){
        super(errorMessage);
    }


}
