package de.fred4jupiter.log4j2.demo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumberGenerator {

    private final Random random;

    public RandomNumberGenerator() {
        random = new Random();
    }

    public int nextNumberBetween(int min, int max) {
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        return random.nextInt((max - min) + 1) + min;
    }

}
