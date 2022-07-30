package com.deloitte.digital.springdatabootcamp.embedded.service;

import com.deloitte.digital.springdatabootcamp.embedded.model.Location;
import com.deloitte.digital.springdatabootcamp.embedded.model.entity.Store;
import com.deloitte.digital.springdatabootcamp.embedded.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public void create() {
        Location location = new Location();
        location.setCity("Iasi");
        location.setStreet("Main");
        location.setNumber(1);

        Store store = new Store();
        store.setName("Pet Store");
        store.setLocation(location);

        storeRepository.save(store);
    }
}
