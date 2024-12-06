package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * A strategy for generating random numbers using Java's built-in Random class.
 * 
 * References:
 * 1. Java Random Class: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html
 */
public class BuiltInRandomStrategy implements RandomNumberStrategy {
    private Random random;

    public BuiltInRandomStrategy() {
        this.random = new Random();
    }

    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1; // Positive integer
    }
}
