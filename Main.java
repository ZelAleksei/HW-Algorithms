package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomArray random = new RandomArray(); // создаём экземпляр класса RandomArray
        int[] testArray = random.createArray(100); //создаём массив элементов с типом int
                                                            // количество устанавливается переданным аргументом

        BubleSort bs = new BubleSort(); // создаём экземпляр класса сортировки пузырьком
        long startTime = System.nanoTime(); // засекаем время начала выполнения сортировки
        bs.sort(testArray); // сортируем "пузырьком"
        long endTime = System.nanoTime(); // засекаем время окончания сортировки
        System.out.println("\nВремя выполнения пузырьковой сортировки:" + (endTime - startTime) / 1000000000.0 + " секунд");

        SelectionSort ssort = new SelectionSort(); // создаём экземпляр класса сортировки "выборкой"
        startTime = System.nanoTime(); // засекаем время начала выполнения сортировки
        ssort.sort(testArray); // сортируем "выборкой"
        endTime = System.nanoTime(); // засекаем время окончания сортировки
        System.out.println("\nВремя выполнения пузырьковой сортировки:" + ((endTime - startTime) / 1000000000.0) + " секунд");

        QuickSort qs = new QuickSort();
        startTime = System.nanoTime();
        qs.qSort(testArray, testArray[0],testArray.length-1 );
        endTime = System.nanoTime();
        System.out.println("\nВремя выполнения сортировки Хоара (Быстрая сортировка) :" + ((endTime - startTime) / 1000000000.0) + " секунд");

        InsertionSort inssort = new InsertionSort();
        startTime = System.nanoTime();
        inssort.sort(testArray);
        endTime = System.nanoTime();
        System.out.println("\nВремя выполнения сортировки вставки :" + ((endTime - startTime) / 1000000000.0) + " секунд");

        startTime = System.nanoTime();
        Arrays.sort(testArray);
        endTime = System.nanoTime();
        System.out.println("\nВремя выполнения сортировки Arrays.sort() :" + ((endTime - startTime) / 1000000000.0) + " секунд");
    }
}
