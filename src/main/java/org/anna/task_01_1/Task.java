package org.anna.task_01_1;

import java.util.stream.IntStream;

public class Task {

    public static void main(String[] args) {
        Task task = new Task();
        int[] array = IntStream.rangeClosed(1, 100).toArray();

        String[] changedNumbers = task.replaceSpecialNumbers(array);
        task.printChangedNumbers(changedNumbers);
    }

    public String[] replaceSpecialNumbers(int[] array) {

        String[] stringArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            String stringValue = "";
            if (array[i] % 3 == 0) {
                stringValue += "Hello";
            }
            if (array[i] % 5 == 0) {
                stringValue += "World";
            }
            if (stringValue.equals("")) {
                stringValue = String.valueOf(array[i]);
            }
            stringArray[i] = stringValue;
        }

        return stringArray;
    }

    private void printChangedNumbers(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }

}
