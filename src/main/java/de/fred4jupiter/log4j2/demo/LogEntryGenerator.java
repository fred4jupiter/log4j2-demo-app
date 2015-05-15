package de.fred4jupiter.log4j2.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.Random;

@Component
public class LogEntryGenerator {

    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(LogEntryGenerator.class);

    @Autowired
    private RandomNumberGenerator randomNumberGenerator;

    public void startLogging() {
        while (true) {
            try {
                Thread.sleep(2000);
                logSomeMessages();
            } catch (InterruptedException e) {
                LOG.error(e.getMessage(), e);
            }
        }
    }

    private void logSomeMessages() {
        int nextId = randomNumberGenerator.nextNumberBetween(1, 4);
        callLogMethodById(nextId);
    }

    private void callLogMethodById(int id) {
        switch (id) {
            case 1:
                debug();
                break;
            case 2:
                info();
                break;
            case 3:
                warn();
                break;
            case 4:
                error();
                break;
            default:
                debug();
        }
    }

    private void debug() {
        ThreadContext.put("userId", "testUser");
        ThreadContext.put("responseTime", "" + randomNumberGenerator.nextNumberBetween(1, 1000));
        LOG.debug("Hello World debug");
        ThreadContext.clearAll();
    }

    private void info() {
        LOG.info("Hello World info");
    }

    private void warn() {
        LOG.warn("Hello World warn");
    }

    private void error() {
        try {
            throw new IllegalStateException("Something went wrong!");
        } catch (IllegalStateException e) {
            LOG.error("Exception: Some error occured: " + e.getMessage(), e);
        }
    }

}
