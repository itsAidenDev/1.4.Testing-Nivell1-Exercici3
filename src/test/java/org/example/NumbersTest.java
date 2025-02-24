package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {

    @Test
    public void testGetElementAtIndex_ThrowsArrayIndexOutOfBoundsException() {
        Numbers arrayNumbers = new Numbers();
        int[] array = {1, 2, 3, 4, 5};

        ArrayIndexOutOfBoundsException exception = assertThrows(ArrayIndexOutOfBoundsException
                .class, () -> {
            arrayNumbers.getElementAtIndex(array, 10);
        });

        System.out.println("Exception message: " +  exception.getMessage());

        assertEquals("Index out of bounds", exception.getMessage());

        assertDoesNotThrow(() -> {
            int value = arrayNumbers.getElementAtIndex(array, 2);
            assertEquals(3, value);
        });
    }
}
