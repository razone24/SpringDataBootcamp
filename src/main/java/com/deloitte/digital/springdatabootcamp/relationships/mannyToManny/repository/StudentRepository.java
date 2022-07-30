package com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.repository;

import com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
