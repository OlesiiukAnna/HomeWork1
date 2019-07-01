package org.anna.task_01_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {

    private Task testedInstance = new Task();

    @Test
    public void shouldReplaceNumbers(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String[] expected = {"1", "2", "Hello", "4", "World", "Hello", "7", "8", "Hello", "World", "11", "Hello",
                "13", "14", "HelloWorld"};
        
        String[] actual = testedInstance.replaceSpecialNumbers(array);

        assertArrayEquals(actual, expected);

    }
}
