package org.example.jpastudent.controller;

import org.example.jpastudent.model.Student;
import org.example.jpastudent.repositories.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRestControllerTest {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp(){
        Student student = new Student();
        student.setName("kuku");
        studentRepository.save(student);
    }

    @Test
    void testOneStudent() {
        List<Student> studentList = studentRepository.findAll();
        assertEquals(1,studentList.size());
    }
}