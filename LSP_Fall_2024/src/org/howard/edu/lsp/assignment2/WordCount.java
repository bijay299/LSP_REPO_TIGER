package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        // Retrieve the current working directory
        String baseDir = System.getProperty("user.dir");

        // Construct the package path by replacing dots with slashes
        String packagePath = WordCount.class.getPackageName().replace('.', '/');

        // Define the target file name
        String targetFileName = "words.txt";

        // Full path to the words.txt file
        String fullFilePath = baseDir + "/src/" + packagePath + "/" + targetFileName;
        System.out.println("Expected file path: " + fullFilePath);

        // Utilize HashMap to keep track of word counts
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Reading the file and echoing its content
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fullFilePath))) {
            String lineContent;

            // Echo the input file content
            System.out.println("Input File Content:");
            while ((lineContent = bufferedReader.readLine()) != null) {
                System.out.println(lineContent);  // Echo each line of the input file

                // Extract words from the line using regex to ignore non-letter characters
                String[] extractedWords = lineContent.split("[^a-zA-Z]+");

                // Process each word in the line
                for (String currentWord : extractedWords) {
                    // Convert to lowercase
                    currentWord = currentWord.toLowerCase();

                    // Check if the word is not a number and has more than 3 characters
                    if (!currentWord.matches("\\d+") && currentWord.length() > 3) {
                        frequencyMap.put(currentWord, frequencyMap.getOrDefault(currentWord, 0) + 1);
                    }
                }
            }
        } catch (IOException ioException) {
            System.err.println("Error reading the file: " + ioException.getMessage());
        }

        // Print out the word frequencies
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
