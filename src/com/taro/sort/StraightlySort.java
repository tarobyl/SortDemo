package com.taro.sort;

/**
 * Created by taro on 13/04/2018.
 */
public class StraightlySort {
    /**
     * 直接排序
     * 第一趟比较: 拿第一个数据依次和它每个数据进行比较,如果第一个数据
     * 大于它后面某个数据,交换.所以第一趟下来.最小的数将跑到第一位
     *
     * 第二趟比较: 拿第二个数据依次和它后面每个数据进行比较,如果第二个数据
     * 大于它后面的某个数据, 交换, 所以第二趟下俩, 第二小的数据会跑到第二位
     *
     * ......
     *
     * 按照此规则, 若数组长度为N, 一共进行 N-1 趟比较.
     */

    public static void straightlySort(int[] array) {
        final int N = array.length;
        int i, j, temp;
        for (i = 0; i < N; i++) {
            for (j = i + 1; j < N; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 在每一趟的比较中获取最小数的索引mindex,在每趟比较结束后将该索引对应的值
     * array[minIndex] 与 该趟的的第1为 (第i位) 进行交换
     * @param array
     */
    public static void straghtlySortAfterOptimize(int[] array) {
        final int N = array.length;
        int i, j, temp, minIndex = 0;
        for (i = 0; i < N; i++) {
            minIndex = i;
            for (j = i + 1; j < N; j++) {
                if (array[i] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
