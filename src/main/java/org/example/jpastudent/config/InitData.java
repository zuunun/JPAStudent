package org.example.jpastudent.config;

import org.example.jpastudent.model.Student;
import org.example.jpastudent.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component //klassen køres automatisk ved applikationens opstart
public class InitData implements CommandLineRunner {//interface der er en del af spring boot
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("zuzu");
        s1.setBornDate(LocalDate.of(2001, 10, 04));
        s1.setBornTime(LocalTime.of(6, 27));
        studentRepository.save(s1);
        studentRepository.save(s1);
        studentRepository.save(s1);
    }
}
