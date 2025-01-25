package org.example;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j > 0 && key < array[i]) {
                j -= 1;
                array[j] = key;
            }
        }
        System.out.println("\\n Отсортированный массив (Метод Хоара)");
        for (int number:array){
            System.out.print(number + " ");
        }
    }
}
