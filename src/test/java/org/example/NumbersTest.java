package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {

    @Test
    void testGetNumberByPosValidIndex() {
        assertEquals(20, Numbers.getNumberByPos(1), "Number in position 1 should be 20.");
    }

    @Test
    void testGetNumberInvalidPos () {
        boolean exceptionThrown = false;

        try {
            Numbers.getNumberByPos(10);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown, "Expected ArrayIndexOutOfBoundsException to be thrown.");
    }
}