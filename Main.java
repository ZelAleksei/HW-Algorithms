package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomArray random = new RandomArray(); // создаём экземпляр класса RandomArray
        int[] testArray = random.createArray(1000); //создаём массив элементов с типом int
        // количество устанавливается переданным аргументом

        BubbleSort bs = new BubbleSort(); // создаём экземпляр класса сортировки пузырьком
        long startTime = System.nanoTime(); // засекаем время начала выполнения сортировки
        int[] sortedArray = bs.sort(testArray); // сортируем "пузырьком"
        long endTime = System.nanoTime(); // засекаем время окончания сортировки
//        arrayOutput(sortedArray, "Пузырька");
        algorithmTimeOutput(startTime, endTime, "Пузырька");

        SelectionSort ssort = new SelectionSort(); // создаём экземпляр класса сортировки "выборкой"
        startTime = System.nanoTime(); // засекаем время начала выполнения сортировки
        sortedArray = ssort.sort(testArray); // сортируем "выборкой"
        endTime = System.nanoTime(); // засекаем время окончания сортировки
//        arrayOutput(sortedArray, "Выборки");
        algorithmTimeOutput(startTime, endTime, "Выборки");

        QuickSort qs = new QuickSort();
        startTime = System.nanoTime();
        sortedArray = qs.qSort(testArray, testArray[0], testArray.length - 1);
        endTime = System.nanoTime();
//        arrayOutput(sortedArray, "Хоара (быстрая сортирока)");
        algorithmTimeOutput(startTime, endTime, "Хоара (быстрая сортирока)");

        InsertionSort inssort = new InsertionSort();
        startTime = System.nanoTime();
        sortedArray = inssort.sort(testArray);
        endTime = System.nanoTime();
//        arrayOutput(sortedArray, "Вставки");
        algorithmTimeOutput(startTime, endTime, "Вставки");

        startTime = System.nanoTime();
        Arrays.sort(testArray);
        endTime = System.nanoTime();
        algorithmTimeOutput(startTime, endTime, "Arrays.sort");
    }

    public static void algorithmTimeOutput(long startTime, long endTime, String nameMethod) {
        System.out.println("Время выполнения сортировки методом " + nameMethod + " : " + ((endTime - startTime) / 1000000000.0) + " секунд");
    }

    public static void arrayOutput(int[] array, String nameMethod) {
        System.out.println("Отсортированный массив методом " + nameMethod); //добавлен вывод массива для проверки сортировки
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
