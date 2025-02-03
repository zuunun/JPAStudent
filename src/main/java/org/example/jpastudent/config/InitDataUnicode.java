package org.example.jpastudent.config;

import org.example.jpastudent.model.Unicode;
import org.example.jpastudent.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitDataUnicode implements CommandLineRunner {


    @Autowired
    UnicodeRepository unicodeRepository;


    @Override
    public void run(String... args) throws Exception {
        Set<Character> unicodeSet = new HashSet<>();


        for (char c = 'A'; c <= 'Z'; c++) {
            unicodeSet.add(c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            unicodeSet.add(c);
        }

        unicodeSet.forEach(character -> {
            Unicode entity = new Unicode();
            entity.setBogstav(character);
            unicodeRepository.save(entity);
        });

        System.out.println("SAVED");
    }
}
