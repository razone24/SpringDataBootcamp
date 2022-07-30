package com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.service;

import com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.entity.Professor;
import com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.entity.Student;
import com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.repository.ProfessorRepository;
import com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    public void create() {
        Student student = new Student();
        student.setName("Student");
        student.setProfessors(new ArrayList<>());

        Professor professor = new Professor();
        professor.setName("Professor");
        professor.setStudents(new ArrayList<>());
        professor.getStudents().add(student);

        student.getProfessors().add(professor);

//        professorRepository.save(professor);
        studentRepository.save(student);
    }
}
