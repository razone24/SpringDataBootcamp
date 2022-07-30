package com.deloitte.digital.springdatabootcamp.temporal.service;

import com.deloitte.digital.springdatabootcamp.temporal.entity.Invoice;
import com.deloitte.digital.springdatabootcamp.temporal.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public void create() {
        Invoice invoice = new Invoice();
        invoice.setDetails("Shopping Invoice");
        invoice.setDate(new Date());

        invoiceRepository.save(invoice);
    }
}
