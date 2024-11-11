package org.howard.edu.assignment6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class IntegerSetTest {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear()")
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty(), "The set should be empty after calling clear().");
    }

    @Test
    @DisplayName("Test case for length()")
    public void testLength() {
        assertEquals(0, set1.length(), "Newly created set should have length 0.");
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.length(), "Set should have length 2 after adding two elements.");
    }

    @Test
    @DisplayName("Test case for equals()")
    public void testEquals() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets with the same elements in different orders should be equal.");

        set2.add(3);
        assertFalse(set1.equals(set2), "Sets with different elements should not be equal.");
    }

    @Test
    @DisplayName("Test case for contains()")
    public void testContains() {
        set1.add(1);
        assertTrue(set1.contains(1), "Set should contain 1 after adding it.");
        assertFalse(set1.contains(2), "Set should not contain 2 if it hasn't been added.");
    }

    @Test
    @DisplayName("Test case for largest()")
    public void testLargest() {
        set1.add(1);
        set1.add(5);
        set1.add(3);
        try {
            assertEquals(5, set1.largest(), "The largest element should be 5.");
        } catch (Exception e) {
            fail("Exception should not be thrown when the set is not empty.");
        }

        set1.clear();
        Exception exception = assertThrows(Exception.class, () -> {
            set1.largest();
        });
        assertEquals("Set cannot be empty.", exception.getMessage());
    }

    @Test
    @DisplayName("Test case for smallest()")
    public void testSmallest() {
        set1.add(1);
        set1.add(5);
        set1.add(3);
        try {
            assertEquals(1, set1.smallest(), "The smallest element should be 1.");
        } catch (Exception e) {
            fail("Exception should not be thrown when the set is not empty.");
        }

        set1.clear();
        Exception exception = assertThrows(Exception.class, () -> {
            set1.smallest();
        });
        assertEquals("Set cannot be empty.", exception.getMessage());
    }

    @Test
    @DisplayName("Test case for add()")
    public void testAdd() {
        set1.add(1);
        set1.add(2);
        set1.add(1);  // Duplicate element should not be added
        assertEquals(2, set1.length(), "Set should contain only unique elements.");
    }

    @Test
    @DisplayName("Test case for remove()")
    public void testRemove() {
        set1.add(1);
        set1.add(2);
        set1.remove(1);
        assertFalse(set1.contains(1), "Set should not contain 1 after it has been removed.");
    }

    @Test
    @DisplayName("Test case for union()")
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
        set1.union(set2);
        assertTrue(set1.contains(3) && set1.contains(4), "Union should add all unique elements from both sets.");
    }

    @Test
    @DisplayName("Test case for intersect()")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2), "Intersection should retain only common elements.");
        assertFalse(set1.contains(1), "Intersection should remove elements not present in the other set.");
    }

    @Test
    @DisplayName("Test case for diff()")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(4);
        set1.diff(set2);
        assertTrue(set1.contains(1) && set1.contains(3), "Difference should remove common elements.");
        assertFalse(set1.contains(2), "Difference should remove common elements.");
    }

    @Test
    @DisplayName("Test case for isEmpty()")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty(), "Newly created set should be empty.");
        set1.add(1);
        assertFalse(set1.isEmpty(), "Set should not be empty after adding an element.");
    }

    @Test
    @DisplayName("Test case for toString()")
    public void testToString() {
        set1.add(1);
        set1.add(2);
        assertEquals("{1, 2}", set1.toString(), "toString should return elements in a formatted string.");
    }
}
