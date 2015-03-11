package de.fred4jupiter.log4j2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LogApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(LogApplication.class, args);
        LogEntryGenerator logEntryGenerator = applicationContext.getBean(LogEntryGenerator.class);
        logEntryGenerator.startLogging();
    }
}
