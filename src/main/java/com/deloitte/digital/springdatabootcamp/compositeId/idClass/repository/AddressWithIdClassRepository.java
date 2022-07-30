package com.deloitte.digital.springdatabootcamp.compositeId.idClass.repository;

import com.deloitte.digital.springdatabootcamp.compositeId.idClass.model.AddressId;
import com.deloitte.digital.springdatabootcamp.compositeId.idClass.model.entity.AddressWithIdClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressWithIdClassRepository extends JpaRepository<AddressWithIdClass, AddressId> {
}
