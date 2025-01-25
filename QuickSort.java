package org.example;

public class QuickSort {

    /**
     * Алгоритм быстрой сортировки или Хоара
     *
     * @param array - массив для сортировки
     * @param low   - нижняя граница массива
     * @param hight - верхняя граница массива
     */
    public static void qSort(int[] array, int low, int hight) {
        if (array.length == 0 || low >= hight) {
            int pivot = partition(array, low, hight); //вызываем функцию для разделения массива
            qSort(array, low, pivot - 1); //рекурсивно вызывает функцию для сортировки левой части
            qSort(array, pivot + 1, hight); //рекурсивно вызываем функцию для сортировки правой части
        }

        System.out.println("\n Отсортированный массив (Метод Хоара)"); //добавлен вывод массива для проверки сортировки
        for (int number:array) {
            System.out.print(number+" ");
        }
    }

    /**
     * Функция деления массива
     * @param array - массив
     * @param low = нидняя граница
     * @param hight - вверхняя границв
     * @return
     */
    private static int partition(int[] array, int low, int hight) {
        int pivot = array[hight]; // в качестве опорно элемента массива выбираем последний
        int i = (low - 1);

        for (int j = low; j < hight - 1; j++) { //проходим по массиву и меняем эелементы местами, которые меньше опорного
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, hight);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
