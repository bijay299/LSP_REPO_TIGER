package org.howard.edu.lsp.finalexam.question2;


/**
 * RandomNumberService provides a singleton instance to generate random numbers
 * using different strategies. Implements the Strategy pattern.
 * 
 * References:
 * 1. Singleton Pattern: https://refactoring.guru/design-patterns/singleton
 * 2. Strategy Pattern: https://refactoring.guru/design-patterns/strategy
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    // Private constructor to prevent instantiation
    private RandomNumberService() {
    }

    /**
     * Returns the singleton instance of RandomNumberService.
     *
     * @return the instance of RandomNumberService
     */
    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for random number generation.
     *
     * @param strategy the strategy to set
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the set strategy.
     *
     * @return a randomly generated number
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set for random number generation");
        }
        return strategy.generateRandomNumber();
    }
}
