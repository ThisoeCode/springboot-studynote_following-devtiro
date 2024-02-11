package com.thisoe.devtirocoursefollow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldCtrl {
    @GetMapping(path="/hello")
    public static String helloWorld() {
        return "Hello world! This is Thisoe's proj.";
    }
}
