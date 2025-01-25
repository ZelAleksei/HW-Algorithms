package org.example;

public class SelectionSort {

    /**
     * Класс сортировка выборкой содержит метод сортировки
     * @param array - массив элементов с типом int , который необходимо отсортировать
     */
    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }

                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("\n Отсортированный массив (Метод выборки)"); //добавлен вывод массива для проверки сортировки
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
