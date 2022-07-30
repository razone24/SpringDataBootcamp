package com.deloitte.digital.springdatabootcamp.relationships.oneToOne.repository;

import com.deloitte.digital.springdatabootcamp.relationships.oneToOne.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
