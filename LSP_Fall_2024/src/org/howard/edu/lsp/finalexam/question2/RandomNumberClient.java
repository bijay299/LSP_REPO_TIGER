package org.howard.edu.lsp.finalexam.question2;

/**
 * Client class for testing RandomNumberService with different strategies.
 * 
 * References:
 * 1. Java Best Practices for Design Patterns: https://www.geeksforgeeks.org/design-patterns-in-java/
 * 2. Strategy Pattern Usage Example: https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Using BuiltInRandomStrategy
        service.setStrategy(new BuiltInRandomStrategy());
        System.out.println("Built-in Random Number: " + service.generateRandomNumber());

        // Using CustomRandomStrategy
        service.setStrategy(new CustomRandomStrategy(System.currentTimeMillis()));
        System.out.println("Custom Random Number: " + service.generateRandomNumber());
    }
}
