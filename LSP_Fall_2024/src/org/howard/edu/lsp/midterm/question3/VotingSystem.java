package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingSystem {
    // Stores the candidates and their corresponding vote counts
    private Map<String, Integer> candidateVotes;

    // Constructor to initialize the candidateVotes map
    public VotingSystem() {
        candidateVotes = new HashMap<>();
    }

    // Method to register a new candidate
    public void registerCandidate(String candidateName) {
        if (!candidateVotes.containsKey(candidateName)) {
            candidateVotes.put(candidateName, 0);  // Start with 0 votes
        } else {
            System.out.println(candidateName + " is already registered as a candidate.");
        }
    }

    // Method to record a vote for a specific candidate
    public void recordVote(String candidateName) {
        if (candidateVotes.containsKey(candidateName)) {
            candidateVotes.put(candidateName, candidateVotes.get(candidateName) + 1);  // Increase vote count
        } else {
            System.out.println("Candidate " + candidateName + " is not registered.");
        }
    }

    // Override toString to display the vote counts for all candidates
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidateVotes.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }

    // Main method for testing the VotingSystem class
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.registerCandidate("Alsobrooks");
        votingSystem.recordVote("Alsobrooks");
        votingSystem.registerCandidate("Hogan");
        System.out.println(votingSystem.toString());
    }
}
