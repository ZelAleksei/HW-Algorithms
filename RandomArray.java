package org.example;

import java.util.Random;

/**
 * Класс RandomArray создаёт массив со случайными элементами типа int и возвращает этот массив
 */
public class RandomArray {

    public static int[] createArray(int size) {
        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(200);
        }
        return array;
    }
}
