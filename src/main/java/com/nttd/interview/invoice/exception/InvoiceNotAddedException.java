package com.nttd.interview.invoice.exception;

public class InvoiceNotAddedException extends RuntimeException {
    public InvoiceNotAddedException(String errorMessage){
        super(errorMessage);
    }

}
