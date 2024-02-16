package com.thisoe.devtirocoursefollow.services.impl;

import com.thisoe.devtirocoursefollow.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "green";
    }
}