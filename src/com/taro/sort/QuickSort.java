package com.taro.sort;

/**
 * Created by taro on 13/04/2018.
 */
public class QuickSort {


    /**
     * 固定切分
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int quickSort(int[] array, int startIndex, int endIndex) {
        int key = array[startIndex];
        while (startIndex < endIndex) {
            while (array[endIndex] >= key && endIndex > startIndex) {
                endIndex--;
            }
            array[startIndex] = array[endIndex];
            while (array[startIndex] <= key && endIndex > startIndex) {
                startIndex++;
            }
            array[endIndex] = array[startIndex];
        }
        array[endIndex] = key;

        return endIndex;
    }

    /**
     * 三取样切分
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int quickSortSample(int[] array, int startIndex, int endIndex) {
        // 三数取中
        int mid = startIndex + (endIndex - startIndex) / 2;
        if (array[mid] > array[endIndex]) swap(array[mid], array[endIndex]);
        if (array[startIndex] > array[endIndex]) swap(array[startIndex], array[endIndex]);
        if (array[mid] > array[startIndex]) swap(array[mid], array[startIndex]);

        int key = array[startIndex];
        while (startIndex < endIndex) {
            while (array[endIndex] >= key && endIndex > startIndex) {
                endIndex--;
            }
            array[startIndex] = array[endIndex];
            while (array[startIndex] <= key && endIndex > startIndex) {
                startIndex++;
            }
            array[endIndex] = array[startIndex];
        }
        array[endIndex] = key;

        return endIndex;
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


    private static void sort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int index = quickSortSample(array, startIndex, endIndex);

        sort(array, startIndex, index - 1);
        sort(array, index + 1, endIndex);
    }

    public static void quickSort(int[] array) {
        final int N = array.length;
        sort(array, 0, N -1);
    }
}
