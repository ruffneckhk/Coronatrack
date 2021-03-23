package com.jorgejnet.coronatrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronatrackApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronatrackApplication.class, args);
    }

}
