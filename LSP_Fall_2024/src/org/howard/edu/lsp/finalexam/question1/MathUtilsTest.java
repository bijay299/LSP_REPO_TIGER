package org.howard.edu.lsp.finalexam.question1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MathUtilsTest {

    @Test
    void factorial_ofZero_shouldReturnOne() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    void factorial_ofPositiveNumber_shouldReturnFactorial() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test
    void factorial_ofNegativeNumber_shouldThrowException() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-5));
    }

    @Test
    void isPrime_forNegativeNumber_shouldReturnFalse() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(-5));
    }

    @Test
    void isPrime_forNonPrimeNumber_shouldReturnFalse() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(4));
    }

    @Test
    void isPrime_forPrimeNumber_shouldReturnTrue() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isPrime(7));
    }

    @Test
    void gcd_ofTwoPositiveNumbers_shouldReturnGCD() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(6, mathUtils.gcd(54, 24));
    }

    @Test
    void gcd_withOneNumberZero_shouldReturnAbsoluteOfOther() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(10, mathUtils.gcd(0, 10));
    }

    @Test
    void gcd_ofBothNumbersZero_shouldThrowException() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }
}
