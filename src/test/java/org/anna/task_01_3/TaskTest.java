package org.anna.task_01_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {

    private Task testedInstance = new Task();

    @Test
    public void shouldReturnNumbersInBracketsString(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String expected = "(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)";

        String actual = testedInstance.returnNumbersInBracketsString(array);

        assertEquals(actual, expected);
    }

}