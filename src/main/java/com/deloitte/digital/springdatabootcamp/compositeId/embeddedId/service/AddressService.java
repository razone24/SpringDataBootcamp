package com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.service;

import com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.model.AddressId;
import com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.model.entity.Address;
import com.deloitte.digital.springdatabootcamp.compositeId.embeddedId.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public void create() {
        AddressId addressId = new AddressId();
        addressId.setCity("Iasi");
        addressId.setStreet("Main");
        addressId.setNumber(1);

        Address address = new Address();
        address.setAddressId(addressId);
        address.setDescription("description");

        addressRepository.save(address);

        System.out.println(addressRepository.findById(addressId).get());
    }
}
