package com.nttd.interview.invoice.model;

import lombok.Data;

import java.util.Date;

@Data
public class Invoice {
    private Long id;
    private String customer;
    private String invoiceNo;
    private String email;
    private Date invoiceDate;
    private Double amount;
    private String status;

}
