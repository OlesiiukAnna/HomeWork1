package org.anna.task_01_2;

public class Task {

    public static void main(String[] args) {
        Task task = new Task();

        int[] array = task.fillArrayWithRandom(10);

        System.out.println(task.arithmeticMean(array));
    }

    int[] fillArrayWithRandom(int arraySize) {
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = 10 + (int) (Math.random() * 11);
        }
        return array;
    }

    int arithmeticMean(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return sum / array.length;
    }
}
