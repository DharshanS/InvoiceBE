package com.nttd.interview.invoice.service;

import com.nttd.interview.invoice.model.Invoice;

import java.util.List;


public interface InvoiceService {
    Invoice addInvoice(Invoice invoice) throws Exception;
    Invoice updateInvoice(Invoice invoice) throws Exception;
    Invoice fetchInvoice(Long id) throws Exception;
    List<Invoice> fetchAllInvoice() throws Exception;
    boolean deleteInvoice(Long id) throws Exception;
}
