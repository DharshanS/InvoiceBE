package com.nttd.interview.invoice.service;

import com.nttd.interview.invoice.model.Invoice;


public interface InvoiceService {
    Invoice addInvoice(Invoice student) throws Exception;
    Invoice fetchInvoice(Long id) throws Exception;
}
