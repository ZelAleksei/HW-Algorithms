package org.example;

public class BubbleSort {

    /**
     * Класс "сортировка пузырьком" содержит метод сортировки
     *
     * @param array - массив элементов с типом int , который необходимо отсортировать
     */
    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int tempVar;
                if (array[i] > array[j]) {
                    tempVar = array[i];
                    array[i] = array[j];
                    array[j] = tempVar;
                }
            }
        }
        return array;
    }
}


