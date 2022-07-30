package com.deloitte.digital.springdatabootcamp.compositeId.idClass.service;

import com.deloitte.digital.springdatabootcamp.compositeId.idClass.model.AddressId;
import com.deloitte.digital.springdatabootcamp.compositeId.idClass.model.entity.AddressWithIdClass;
import com.deloitte.digital.springdatabootcamp.compositeId.idClass.repository.AddressWithIdClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressWithIdClassService {

    @Autowired
    private AddressWithIdClassRepository addressWithIdClassRepository;

    public void create() {

        AddressWithIdClass address = new AddressWithIdClass();
        address.setCity("Iasi");
        address.setStreet("Main");
        address.setNumber(1);
        address.setDescription("description");

        addressWithIdClassRepository.save(address);

        AddressId addressId = new AddressId();
        addressId.setCity("Iasi");
        addressId.setStreet("Main");
        addressId.setNumber(1);

        System.out.println(addressWithIdClassRepository.findById(addressId).get());
    }
}
