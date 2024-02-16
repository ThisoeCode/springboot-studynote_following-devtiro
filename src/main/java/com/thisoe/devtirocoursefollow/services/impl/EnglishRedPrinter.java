package com.thisoe.devtirocoursefollow.services.impl;

import com.thisoe.devtirocoursefollow.services.RedPrinter;
import org.springframework.stereotype.Component;

//@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "red";
    }
}
