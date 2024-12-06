package org.howard.edu.lsp.finalexam.question2;

/**
 * A custom strategy for generating random numbers using a simple linear congruential generator.
 * 
 * References:
 * 1. Linear Congruential Generator (LCG) Algorithm: https://en.wikipedia.org/wiki/Linear_congruential_generator
 * 2. LCG Example: https://stackoverflow.com/questions/39484875/how-do-i-implement-my-own-simple-random-number-generator
 */
public class CustomRandomStrategy implements RandomNumberStrategy {
    private long seed;

    public CustomRandomStrategy(long seed) {
        this.seed = seed;
    }

    @Override
    public int generateRandomNumber() {
        seed = (seed * 6364136223846793005L + 1) % (1L << 32);
        return (int) Math.abs(seed % Integer.MAX_VALUE) + 1; // Positive integer
    }
}
