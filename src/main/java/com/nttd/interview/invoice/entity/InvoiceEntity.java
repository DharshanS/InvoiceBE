package com.nttd.interview.invoice.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "invoice")
@Data
public class InvoiceEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "invoice_no")
    private String invoiceNo;

    @Column(name = "customer")
    private String customer;

    @Column(name = "email")
    private String email;

    @Column(name = "invoice_date")
    private Date invoiceDate;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "status")
    private String status;

    @Column(name = "updated_date")
    private Date updatedDate;


}
