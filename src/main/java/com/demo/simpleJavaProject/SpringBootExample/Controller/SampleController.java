package com.demo.simpleJavaProject.SpringBootExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public String sayTarget () {
        return "Target is an awesome company.";
    }
}
