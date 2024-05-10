package com.nttd.interview.invoice.service;

import com.nttd.interview.invoice.entity.InvoiceEntity;
import com.nttd.interview.invoice.exception.InvoiceNotAddedException;
import com.nttd.interview.invoice.exception.InvoiceNotFoundException;
import com.nttd.interview.invoice.model.Invoice;
import com.nttd.interview.invoice.repo.InvoiceRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Slf4j
@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepo repo;

    @Override
    public Invoice addInvoice(Invoice invoice) {
        try {
            log.info("Adding invoice {} ", invoice);
            InvoiceEntity invoiceEntity = new InvoiceEntity();
            //segregated the objects later we can add any business logic here
            BeanUtils.copyProperties(invoice, invoiceEntity);
            invoiceEntity.setUpdatedDate(new Date());
            InvoiceEntity savedInvoice = repo.save(invoiceEntity);
            BeanUtils.copyProperties(savedInvoice, invoice);
            return invoice;
        }
        catch (Exception e){
            log.error(" Invoice not added : {} ",e.getMessage());
            throw new InvoiceNotAddedException("Invoice not added : " + e.getMessage());
        }
    }

    @Override
    public Invoice fetchInvoice(Long id) {
        log.info("Fetch invoice id {} ", id);
        Optional<InvoiceEntity> entity = repo.findById(id);
        if (entity.isPresent()) {
            Invoice invoice = new Invoice();
            BeanUtils.copyProperties(entity.get(), invoice);
            return invoice;
        }
        log.error(" Invoice not found :");
        throw new InvoiceNotFoundException("Invoice Not Found Exception ");
    }
}
