package org.pcloud.appevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service

@SpringBootApplication
public class AppEventApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppEventApplication.class, args);
    }
}
