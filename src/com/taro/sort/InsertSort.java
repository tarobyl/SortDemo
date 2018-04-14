package com.taro.sort;

/**
 * Created by taro on 14/04/2018.
 */
public class InsertSort {

    public static void insertSort(int[] array) {
        final int N = array.length;
        int i, j, target;
        for (i = 1; i < N; i++) {
            target = array[i];
            j = i;
            while (j > 0 && target < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = target;
        }
    }
}
