package de.fred4jupiter.log4j2.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class LoggingTest {

    private static final Logger LOG = LogManager.getLogger(LoggingTest.class);

    @Test
    public void logSomething() {
        LOG.debug("Hello");
    }
}

