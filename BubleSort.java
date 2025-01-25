package org.example;

public class BubleSort {

    /**
     * Класс "сортировка пузырьком" содержит метод сортировки
     * @param array - массив элементов с типом int , который необходимо отсортировать
     */
    public static void sort(int[] array) {

        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                int tempVar;
                if (array[i]>array[j]){
                    tempVar = array[i];
                    array[i] = array[j];
                    array[j] = tempVar;
                }
            }
        }

        System.out.println("Отсортированный массив (Метод пузырька)"); //добавлен вывод массива для проверки сортировки
        for (int number:array) {
            System.out.print(number+" ");
        }
    }
}


