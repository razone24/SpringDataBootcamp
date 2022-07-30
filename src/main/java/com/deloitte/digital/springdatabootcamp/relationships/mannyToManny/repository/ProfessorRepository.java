package com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.repository;

import com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
