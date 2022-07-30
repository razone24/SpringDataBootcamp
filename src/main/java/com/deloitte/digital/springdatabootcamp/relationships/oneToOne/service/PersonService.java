package com.deloitte.digital.springdatabootcamp.relationships.oneToOne.service;

import com.deloitte.digital.springdatabootcamp.relationships.oneToOne.entity.Passport;
import com.deloitte.digital.springdatabootcamp.relationships.oneToOne.entity.Person;
import com.deloitte.digital.springdatabootcamp.relationships.oneToOne.repository.PassportRepository;
import com.deloitte.digital.springdatabootcamp.relationships.oneToOne.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PassportRepository passportRepository;

    public void create() {
        Person person = new Person();
        person.setName("Popescu");

        Passport passport = new Passport();
        passport.setDescription("Description");
        passport.setNumber(1245);
        passport.setPerson(person);

        passportRepository.save(passport);
    }
}
