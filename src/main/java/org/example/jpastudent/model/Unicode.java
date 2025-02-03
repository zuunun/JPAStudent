package org.example.jpastudent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Unicode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int unicode;
    char bogstav;
    String description;


    public Unicode(Long id, int unicode, char bogstav, String description) {
        this.id = id;
        this.unicode = unicode;
        this.bogstav = bogstav;
        this.description = description;
    }



    public Unicode() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public char getBogstav() {
        return bogstav;
    }

    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }






}
