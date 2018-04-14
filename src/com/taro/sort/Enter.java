package com.taro.sort;

import com.sun.jndi.toolkit.ctx.StringHeadTail;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.Scanner;

/**
 * Created by taro on 12/04/2018.
 */
public class Enter {

    public static void main(String[] arg) {
        int[] array = {3, 5, 7, 0, 88, 21, 99, 17, 54, 11};

        StringBuilder stringBuilder = new StringBuilder("type a num to choose your function:\n");
        stringBuilder.append("11 -> StraightlySort.straightlySort()\n");
        stringBuilder.append("12 -> StraightlySort.straightlySortAfterOptimize()\n");
        stringBuilder.append("21 -> Bubbling.baseBubbling()\n");
        stringBuilder.append("22 -> Bubbling.bubblingWithFlag()\n");
        stringBuilder.append("23 -> Bubbling.bubblingWithEndTail()\n");
        stringBuilder.append("31 -> QuickSort.quickSort()\n");
        stringBuilder.append("41 -> InsertSort.quickSort()\n");
        stringBuilder.append(":");

        Log.p(stringBuilder.toString());

        Scanner scanner = new Scanner(System.in);

        int type = scanner.nextInt();

        switch (type) {
            case 11:
                StraightlySort.straightlySort(array);
                break;
            case 12:
                StraightlySort.straghtlySortAfterOptimize(array);
                break;
            case 21:
                Bubbling.baseBubbling(array);
                break;
            case 22:
                Bubbling.bubblingWithFlag(array);
                break;
            case 23:
                Bubbling.bubblingWithEndTail(array);
                break;
            case 31:
                QuickSort.quickSort(array);
                break;
            case 41:
                InsertSort.insertSort(array);
        }

        for (int i = 0; i < array.length; i++) {
            Log.p(array[i] + " ");
        }
    }
}
