package com.ibm.apt.sba_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class SbaBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbaBackApplication.class, args);
    }

}
