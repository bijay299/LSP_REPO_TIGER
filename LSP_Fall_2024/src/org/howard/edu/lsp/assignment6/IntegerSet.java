package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class representing a custom IntegerSet that performs 
 * set operations such as union, intersection, and complement.
 */
public class IntegerSet {

    // Internal list to store the elements of the set
    private List<Integer> elements = new ArrayList<>();

    /**
     * Default Constructor to initialize an empty set.
     */
    public IntegerSet() {
    }

    /**
     * Parameterized Constructor to initialize the set with given elements.
     * 
     * @param initialElements ArrayList of integers to populate the set.
     */
    public IntegerSet(ArrayList<Integer> initialElements) {
        this.elements = initialElements;
    }

    /**
     * Clears all elements from the set.
     */
    public void clear() {
        elements.clear();
    }

    /**
     * Returns the number of elements in the set.
     * 
     * @return Size of the set.
     */
    public int length() {
        return elements.size();
    }

    /**
     * Checks if the given object is equal to the current set.
     * Two sets are considered equal if they contain the same elements, 
     * irrespective of order.
     * 
     * @param obj The object to compare with the current set.
     * @return true if both sets are equal, otherwise false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerSet otherSet = (IntegerSet) obj;
        return elements.containsAll(otherSet.elements) && 
               otherSet.elements.containsAll(elements);
    }

    /**
     * Checks if the set contains the given value.
     * 
     * @param value The value to check.
     * @return true if the value is present, otherwise false.
     */
    public boolean contains(int value) {
        return elements.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * 
     * @return The largest element.
     * @throws Exception If the set is empty.
     */
    public int largest() throws Exception {
        if (elements.isEmpty()) {
            throw new Exception("Set cannot be empty.");
        }
        return Collections.max(elements);
    }

    /**
     * Returns the smallest element in the set.
     * 
     * @return The smallest element.
     * @throws Exception If the set is empty.
     */
    public int smallest() throws Exception {
        if (elements.isEmpty()) {
            throw new Exception("Set cannot be empty.");
        }
        return Collections.min(elements);
    }

    /**
     * Adds an element to the set if it is not already present.
     * 
     * @param value The value to be added.
     */
    public void add(int value) {
        if (!elements.contains(value)) {
            elements.add(value);
        }
    }

    /**
     * Removes an element from the set if it is present.
     * 
     * @param value The value to be removed.
     */
    public void remove(int value) {
        elements.remove(Integer.valueOf(value));
    }

    /**
     * Performs the union of the current set with another set.
     * Adds elements from the other set that are not already present.
     * 
     * @param otherSet The set to union with.
     */
    public void union(IntegerSet otherSet) {
        for (int element : otherSet.elements) {
            if (!elements.contains(element)) {
                elements.add(element);
            }
        }
    }

    /**
     * Performs the intersection of the current set with another set.
     * Retains only the elements that are present in both sets.
     * 
     * @param otherSet The set to intersect with.
     */
    public void intersect(IntegerSet otherSet) {
        elements.retainAll(otherSet.elements);
    }

    /**
     * Computes the difference of the current set from another set.
     * Removes all elements from the current set that are present in the other set.
     * 
     * @param otherSet The set to subtract from the current set.
     */
    public void diff(IntegerSet otherSet) {
        elements.removeAll(otherSet.elements);
    }

    /**
     * Computes the complement of the current set with respect to another set.
     * Keeps only the elements that are in the other set but not in the current set.
     * 
     * @param otherSet The set to compare with.
     */
    public void complement(IntegerSet otherSet) {
        List<Integer> complementElements = new ArrayList<>();
        for (int element : otherSet.elements) {
            if (!elements.contains(element)) {
                complementElements.add(element);
            }
        }
        elements = complementElements;
    }

    /**
     * Checks if the set is empty.
     * 
     * @return true if the set is empty, otherwise false.
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * 
     * @return A string in the format {element1, element2, ...}.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i));
            if (i < elements.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}


