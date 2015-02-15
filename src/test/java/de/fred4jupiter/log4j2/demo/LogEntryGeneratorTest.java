package de.fred4jupiter.log4j2.demo;


public class LogEntryGeneratorTest {

    public static void main(String[] args) {
        LogEntryGenerator logEntryGenerator = new LogEntryGenerator();

        while (true) {
            try {
                Thread.sleep(2000);
                logEntryGenerator.logSomeMessages();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
