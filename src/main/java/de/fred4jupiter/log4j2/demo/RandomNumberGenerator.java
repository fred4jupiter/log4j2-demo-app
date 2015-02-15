package de.fred4jupiter.log4j2.demo;

import java.util.Random;


public class RandomNumberGenerator {

    private int min = 1;

    private int max = 4;

    private final Random random;

    public RandomNumberGenerator() {
        random = new Random();
    }

    public int getNextId() {
        return random.nextInt(max - min + 1) + min;
    }

}
