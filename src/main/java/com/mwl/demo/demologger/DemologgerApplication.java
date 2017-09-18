package com.mwl.demo.demologger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Duration;

@SpringBootApplication
@EnableScheduling
public class DemologgerApplication {
    private static final Logger logger = LoggerFactory.getLogger(DemologgerApplication.class);

    @Scheduled(fixedDelay = 10_000L)
    public void regularExceptionThrower() {
        logger.error("Something really really bad happened", new RuntimeException("Exception message"));
    }

    public static void main(String[] args) {
        SpringApplication.run(DemologgerApplication.class, args);
    }
}
