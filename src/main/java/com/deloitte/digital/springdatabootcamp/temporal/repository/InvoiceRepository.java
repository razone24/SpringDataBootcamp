package com.deloitte.digital.springdatabootcamp.temporal.repository;

import com.deloitte.digital.springdatabootcamp.temporal.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
