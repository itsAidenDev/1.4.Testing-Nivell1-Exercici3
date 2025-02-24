package org.example;

public class Numbers {
    public int getElementAtIndex(int[] array, int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= array.length){
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }
}

