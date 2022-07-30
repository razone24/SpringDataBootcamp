package com.deloitte.digital.springdatabootcamp.relationships.oneToOne.repository;

import com.deloitte.digital.springdatabootcamp.relationships.oneToOne.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
