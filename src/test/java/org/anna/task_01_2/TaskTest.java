package org.anna.task_01_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {

    private Task testedInstance = new Task();

    @Test
    public void shouldCalculateArithmeticMean() {
        int[] array = {10, 8, 6, 4, 2};
        int expected = 6;

        int actual = testedInstance.arithmeticMean(array);

        assertEquals(expected, actual);
    }

}