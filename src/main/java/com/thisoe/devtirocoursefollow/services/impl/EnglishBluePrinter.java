package com.thisoe.devtirocoursefollow.services.impl;

import com.thisoe.devtirocoursefollow.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "blue";
    }
}