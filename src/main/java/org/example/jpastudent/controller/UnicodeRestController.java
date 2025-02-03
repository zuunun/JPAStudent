package org.example.jpastudent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeRestController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }
//
//    @GetMapping("/char/{character}")
//    public String charToUnicode(@PathVariable char c) {
//        int unicode = (int) c;
//        return "char=" + c + " unicode=" + unicode;
//    }

    @GetMapping("/char/{character}")
    public String charToUnicode(@PathVariable String character) {
        char c = character.charAt(0);
        int unicode = (int) c;
        return "char=" + c + " unicode=" + unicode;
    }


































}
