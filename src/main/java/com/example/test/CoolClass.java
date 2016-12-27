package com.example.test;

import org.springframework.stereotype.Service;

@Service
public class CoolClass {

    public void execute(Long id) {
        System.out.println(id);
    }

    public void execute(String myText) {
        System.out.println(myText);
    }

    public void execute(CustomClass customClass) {
        System.out.println(customClass);
    }

    public void execute(EpicClass epicClass) {
        System.out.println(epicClass);
    }
}
