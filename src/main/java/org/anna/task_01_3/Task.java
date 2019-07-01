package org.anna.task_01_3;

import java.util.stream.IntStream;

public class Task {

    public static void main(String[] args) {
        Task task = new Task();

        int[] array = IntStream.rangeClosed(1, 30).toArray();

        String stringOfNumbers = task.returnNumbersInBracketsString(array);
        System.out.println(stringOfNumbers);
    }

    public String returnNumbersInBracketsString(int[] array) {

        StringBuilder numbersString = new StringBuilder();

        for (int value : array) {
            numbersString.append(String.format("(%d)", value));
        }

        return numbersString.toString();
    }
}
