package com.windsing.tech_point.about_sort;

import java.util.Arrays;

/**
 * 二分查找
 */
public class BinarySearch {
    /**
     * 参数依次是：数组，目标值，起始位置，结束位置.
     */
    public int binarySearch(int[] arr, int num, int start, int end) {
        /*获取最中间的值*/
        int mid = (end - start) / 2 + start;

        //校验中间值是否就是目标值，不是则继续截取数组。
        if (arr[mid] == num) {
            return mid;
        }

        //校验参数合法性
        if (start >= num) {
            return -1;
        }

        if (num < arr[mid]) {  //判断目标值 小于 则从起始位置到 中间位置继续递归
            return binarySearch(arr, num, start, mid - 1);
        }
        if (num > arr[mid]) { //判断目标值 大于 则从中间位置到 结束位置继续递归
            return binarySearch(arr, num, mid + 1, end);
        }

        return -1;
    }


    public static void main(String[] args) {

        //在一个有序的序列中
        int[] arr = {1, 3, 5, 7, 9, 11, 17, 89, 82, 91, 100, 101, 137, 301};

        int i = new BinarySearch().binarySearch(arr, 7, 0, arr.length - 1);
        System.out.println(i);
    }


}
