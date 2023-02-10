package com.windsing.tech_point.about_sort;

public class QuickSort {

    //快排实现方法
    public static void quickRow(int[] array, int low, int high) {

        // 结束条件
        if (low >= high) {
            return;
        }

        int i, j, pivot;
        i = low;
        j = high;

        //选择的节点，这里选择的数组的第一数作为节点
        pivot = array[low];
        while (i < j) {
            //从右往左找比节点小的数，循环结束要么找到了，要么i=j
            while (array[j] >= pivot && i < j) {
                j--;
            }
            //从左往右找比节点大的数，循环结束要么找到了，要么i=j
            while (array[i] <= pivot && i < j) {
                i++;
            }
            //如果i!=j说明都找到了，就交换这两个数
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //i==j一轮循环结束，交换节点的数和相遇点的数
        array[low] = array[i];
        array[i] = pivot;
        //数组“分两半”,再重复上面的操作
        quickRow(array, low, i - 1);
        quickRow(array, i + 1, high);
    }

    //测试
    public static void main(String[] args) {
        int[] array = {6, 3, 7, 1, 9, 4, 8, 5, 2, 10};
        int low = 0, high = array.length - 1;
        quickRow(array, low, high);
        for (int i : array) {
            System.out.println(i);
        }
    }


}
