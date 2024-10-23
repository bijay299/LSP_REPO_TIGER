package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) throws Exception {

        // Create two instances of IntegerSet
        IntegerSet firstSet = new IntegerSet();
        IntegerSet secondSet = new IntegerSet();

        // Add elements to the first set
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);

        // Add elements to the second set
        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(5);

        // Display the initial values of both sets
        System.out.println("Initial value of First Set: " + firstSet.toString());
        System.out.println("Initial value of Second Set: " + secondSet.toString());
        System.out.println();  // Line break for readability

        // Test smallest and largest element methods
        System.out.println("Testing smallest and largest element methods:");
        System.out.println("Smallest value in First Set: " + firstSet.smallest());  
        System.out.println("Largest value in First Set: " + firstSet.largest());    
        System.out.println();

        // Test if specific elements are present in the set
        System.out.println("Testing contains method:");
        System.out.println("First Set contains 2: " + firstSet.contains(2));  
        System.out.println("First Set contains 5: " + firstSet.contains(5));  
        System.out.println();

        // Test equality between two sets
        System.out.println("Testing equals method:");
        System.out.println("Current value of First Set: " + firstSet.toString());
        System.out.println("Current value of Second Set: " + secondSet.toString());
        System.out.println("Are both sets equal: " + firstSet.equals(secondSet));  
        secondSet.add(1);
        secondSet.add(2);
        System.out.println("Second Set after adding 1 and 2: " + secondSet.toString());
        System.out.println("Are both sets equal after modification: " + firstSet.equals(secondSet));  
        System.out.println();

        // Test union of two sets
        System.out.println("Testing union method:");
        System.out.println("First Set: " + firstSet.toString());
        System.out.println("Second Set: " + secondSet.toString());
        firstSet.union(secondSet);
        System.out.println("Union of First and Second Set: " + firstSet.toString());  
        System.out.println();

        // Test intersection of two sets
        System.out.println("Testing intersection method:");
        firstSet = new IntegerSet();  // Reset First Set
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        System.out.println("First Set: " + firstSet.toString());
        System.out.println("Second Set: " + secondSet.toString());
        firstSet.intersect(secondSet);
        System.out.println("Intersection of First and Second Set: " + firstSet.toString());  
        System.out.println();

        // Test difference between two sets
        System.out.println("Testing difference method:");
        firstSet = new IntegerSet();  // Reset First Set
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        System.out.println("First Set: " + firstSet.toString());
        System.out.println("Second Set: " + secondSet.toString());
        firstSet.diff(secondSet);
        System.out.println("Difference between First and Second Set: " + firstSet.toString()); 
        System.out.println();

        // Test complement (alternative difference) of two sets
        System.out.println("Testing complement method:");
        firstSet = new IntegerSet();  // Reset First Set
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        System.out.println("First Set: " + firstSet.toString());
        System.out.println("Second Set: " + secondSet.toString());
        firstSet.complement(secondSet);
        System.out.println("Complement of First and Second Set: " + firstSet.toString());  
        System.out.println();

        // Test if the set is empty
        System.out.println("Testing isEmpty method:");
        System.out.println("First Set: " + firstSet.toString());
        System.out.println("Is First Set empty: " + firstSet.isEmpty());  
        firstSet.clear();
        System.out.println("First Set after clear: " + firstSet.toString());
        System.out.println("Is First Set empty after clear: " + firstSet.isEmpty()); 
        System.out.println();

        // Test clearing the set
        System.out.println("Testing clear method:");
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        System.out.println("First Set before clear: " + firstSet.toString());
        firstSet.clear();
        System.out.println("First Set after clear: " + firstSet.toString());  
    }
}


