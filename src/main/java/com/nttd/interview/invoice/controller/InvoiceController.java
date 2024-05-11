package com.nttd.interview.invoice.controller;


import com.nttd.interview.invoice.request.InvoiceRequest;
import com.nttd.interview.invoice.service.InvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author S.Dharshan
 */
@RestController
@CrossOrigin
public class InvoiceController {

    @Autowired
    InvoiceServiceImpl service;

    @PostMapping(value = "/invoices")
    ResponseEntity<?> addInvoice(@RequestBody InvoiceRequest request) {
        return new ResponseEntity<>(service.addInvoice(request.getInvoice()), HttpStatus.OK);
    }

    @PutMapping(value = "/invoices")
    ResponseEntity<?> updateInvoice(@RequestBody InvoiceRequest request) {
        return new ResponseEntity<>(service.addInvoice(request.getInvoice()), HttpStatus.OK);
    }

    @GetMapping(value = "/invoices/{id}")
    ResponseEntity<?> fetchInvoice(@PathVariable("id") Long invoiceId) {
        return new ResponseEntity<>(service.fetchInvoice(invoiceId), HttpStatus.OK);
    }

    @GetMapping(value = "/invoices")
    ResponseEntity<?> fetchAllInvoice() {
        return new ResponseEntity<>(service.fetchAllInvoice(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/invoices/{id}")
    ResponseEntity<?> deleteInvoice(@PathVariable("id") Long invoiceId) {
        return new ResponseEntity<>(service.deleteInvoice(invoiceId), HttpStatus.OK);
    }
}
