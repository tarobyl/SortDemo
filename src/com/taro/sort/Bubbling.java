package com.taro.sort;

/**
 * Created by taro on 12/04/2018.
 */
public class Bubbling {

    /**
     * 冒泡排序
     * 设数组的长度为N
     * 1.比较前后相邻的两个数,如果前面的数大于后面的数,将两个数对换
     * 2.对数组的第0个数到第N-1个数进行一次遍历后,最大的一个数就"沉"到了数组的第N-1的位置
     * N=N-1,如果N不等于0就重复前面两个步骤,否组排序完成
     */

    /**
     * 基本的冒泡排序
     */
    public static void baseBubbling(int[] array) {
        int N = array.length;
        int i, j, temp;
        for(i = 0; i < N; i++) {
            for (j = 0; j < N - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    /**
     * 如果本身就是一个有序的序列,或者序列后面大部分是一个有序的序列
     * 就可以在发现完全有序后结束排序. 设一个Flag, 如果这一趟发生了
     * 交换,则为true,否则为false. 如果有一趟没有发生交换,说明排序
     * 完成
     */
    public static void bubblingWithFlag(int[] array) {
        int N = array.length;
        int i, temp;
        boolean flag = true;
        while(flag) {
            flag = false;
            for (i = 0; i < N - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
            N--;
        }
    }

    /**
     * 如果1000个数的数组,前面100个无序,后面900个有序且都大于前面100个数.
     * 那么在第一趟遍历后,发生交换的位置必定小于100,且这个位置之后的数字已经
     * 有序了,也就是这个位置之后不需要再排序了.我们把这个位置记录下来,第二次
     * 只用从数组头遍历到这个位置就可以. 对于bubblingWithFlag的算法,虽然也
     * 只用排序100次,但是前面100次每次都对后面的900个数进行了比较.而对于设置
     * 尾边界的排序,后面的900个数据,只会被遍历一次
     */
    public static void bubblingWithEndTail(int[] array) {
        int N = array.length;
        int endTail = N;
        int i, temp, k;

        while(endTail > 0) {
            k = endTail;
            endTail = 0;
            for (i = 0; i < k - 1; i++) {

                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                    endTail = i + 1;
                }
            }

        }
    }

}
