package de.fred4jupiter.log4j2.demo;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;

public class SingleLoggingManualTest {

    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(SingleLoggingManualTest.class);

    @Test
    public void sendSingleLogStatement() {
        LOG.info("Hello World info");
    }
}
