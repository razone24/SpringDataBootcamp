package com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.repository;

import com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.model.AddressId;
import com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, AddressId> {
}
