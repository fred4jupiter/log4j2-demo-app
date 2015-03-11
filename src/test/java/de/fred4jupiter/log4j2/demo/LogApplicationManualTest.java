package de.fred4jupiter.log4j2.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LogApplication.class)
public class LogApplicationManualTest {

    @Autowired
    private LogEntryGenerator logEntryGenerator;

	@Test
	public void contextLoads() {
        logEntryGenerator.startLogging();
	}

}
