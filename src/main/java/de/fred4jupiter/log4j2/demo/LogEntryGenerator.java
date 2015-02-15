package de.fred4jupiter.log4j2.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.ThreadContext;

/**
 * Created by MIS on 09.02.2015.
 */
public class LogEntryGenerator {

    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(LogEntryGenerator.class);

    public static void main(String[] args) {

        ThreadContext.put("userId", "testUser");
        LOG.debug("Hello from Log Entry Generator");


    }
}
