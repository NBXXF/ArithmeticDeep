package com.xxf.arithmetic.sort;

import java.util.Arrays;

/**
 * com.xxf.arithmetic.sort
 * icourt
 * 2018/9/19
 * author:asange
 * email:xuanyouwu@163.com
 **/
public class PopSortTest {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8, 2, 10};

        test(Arrays.copyOf(arr, arr.length));
        test2(Arrays.copyOf(arr, arr.length));

    }

    public static void test2(int[] arr) {
        int count=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("count:"+count);
    }

    public static void test(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                count++;
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("count:"+count);
    }
}
