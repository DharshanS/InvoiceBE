package com.nttd.interview.invoice.repo;

import com.nttd.interview.invoice.entity.InvoiceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvoiceRepo extends CrudRepository<InvoiceEntity,Long> {
}
