package com.demo.simpleJavaProject.SpringBootExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public String sayTarget () {
        return "Target is an awesome company.";
    }

    @GetMapping("uppercase")
    public void convertUpperCase() {
        String sentence = "Target is an awesome company. Hope you liked too. Awaiting for TIAAM, it is going to rock and lets enjoy.";
        final int ITERATIONS = Math.max(Integer.getInteger("iterations", 1), 1);
        for (int iter = 0; iter < ITERATIONS; iter++) {
            if (ITERATIONS != 1) System.out.println("-- iteration " + (iter + 1) + " --");
            long total = 0, start = System.currentTimeMillis(), last = start;
            for (int i = 1; i < 10_000_000; i++) {
                total += sentence.chars().filter(Character::isUpperCase).count();
                if (i % 1_000_000 == 0) {
                    long now = System.currentTimeMillis();
                    System.out.printf("%d (%d ms)%n", i / 1_000_000, now - last);
                    last = now;
                }
            }
            System.out.printf("total: %d (%d ms)%n", total, System.currentTimeMillis() - start);
        }
    }
}
