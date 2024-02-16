package com.thisoe.devtirocoursefollow.services.impl;

import com.thisoe.devtirocoursefollow.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class JapaneseRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "aka";
    }
}
