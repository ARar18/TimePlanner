package org.example.timeplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TimePlannerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimePlannerApplication.class, args);
    }
}
