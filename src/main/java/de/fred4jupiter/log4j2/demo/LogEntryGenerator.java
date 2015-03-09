package de.fred4jupiter.log4j2.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.ThreadContext;


public class LogEntryGenerator {

    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(LogEntryGenerator.class);

    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public void logSomeMessages() {
        int nextId = randomNumberGenerator.getNextId();
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
        LOG.debug("Hello World debug");
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
