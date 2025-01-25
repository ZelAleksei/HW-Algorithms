package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomArray random = new RandomArray(); // создаём экземпляр класса RandomArray
        int[] testArray = random.createArray(10_000); //создаём массив элементов с типом int
                                                            // количество устанавливается переданным аргументом

        BubleSort bs = new BubleSort(); // создаём экземпляр класса сортировки пузырьком
        long startTime = System.nanoTime(); // засекаем время начала выполнения сортировки
        bs.sort(testArray); // сортируем "пузырьком"
        long endTime = System.nanoTime(); // засекаем время окончания сортировки
        double elapsedTimeInSeconds = (endTime - startTime) / 1000000000.0; // узнаём разницу начала и окончания сортировки и переводим в секунды
        System.out.println("\nВремя выполнения пузырьковой сортировки:" + elapsedTimeInSeconds + " секунд");

        SelectionSort ssort = new SelectionSort(); // создаём экземпляр класса сортировки "выборкой"
        startTime = System.nanoTime(); // засекаем время начала выполнения сортировки
        ssort.sort(testArray); // сортируем "выборкой"
        endTime = System.nanoTime(); // засекаем время окончания сортировки
        elapsedTimeInSeconds = (endTime - startTime) / 1000000000.0; // узнаём разницу начала и окончания сортировки и переводим в секунды
        System.out.println("\nВремя выполнения пузырьковой сортировки:" + elapsedTimeInSeconds + " секунд");

        quickSort qs = new quickSort();
        startTime = System.nanoTime();
        qs.qSort(testArray, testArray[0],testArray.length-1 );
        endTime = System.nanoTime();
        elapsedTimeInSeconds = (endTime - startTime) / 1000000000.0; // узнаём разницу начала и окончания сортировки и переводим в секунды
        System.out.println("\nВремя выполнения сортировки Хоара (Быстрая сортировка) :" + elapsedTimeInSeconds + " секунд");

        startTime = System.nanoTime();
        Arrays.sort(testArray);
        endTime = System.nanoTime();
        elapsedTimeInSeconds = (endTime - startTime) / 1000000000.0; // узнаём разницу начала и окончания сортировки и переводим в секунды
        System.out.println("\nВремя выполнения сортировки Arrays.sort() :" + elapsedTimeInSeconds + " секунд");
    }
}
