package com.windsing.tech_point.Sort;

import java.util.Arrays;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class BubbleSort {
    public static void main(String[] args) {

//        bubble_sort();

//        array_sort();

        // 首年租金
        float price_per_unit = 2.5f; // 每平米单价
        float area = 30f; // 每个房间的面积
        int num_day = 365; // 租用天数
        int num_room = 20; // 房间个数
        System.out.println("首年租金：" + num_room * num_day * area * price_per_unit);

        // 装修费用
        float price_per_finish = 30000.0f;
        System.out.println("装修费用：" + num_room * price_per_finish);

        // 床上用品、物业、水电、人工、网络、清洗

        // 年毛收入（年70%的时间，客房70%入住率）
        float price_pre_room = 368.0f;
        float occupancy_rate = 0.7f;
        System.out.println("年毛收入：" + price_pre_room * (num_day * occupancy_rate) * (num_room * occupancy_rate));

        System.out.println(365 * 0.7);

    }

    public static void bubble_sort() {
        int[] array_a = {3, 2, 0, 3, 2, 4, 8, 7};

        long before = new Date().getTime();
        for (int q = 0; q < 10000; q++) {
            int temp_bigger;
            for (int i = 0; i < array_a.length; i++) {
                for (int j = i + 1; j < array_a.length; j++) {
                    if (array_a[i] > array_a[j]) {
                        temp_bigger = array_a[i];
                        array_a[i] = array_a[j];
                        array_a[j] = temp_bigger;
                    }
                }
//            System.out.println(array_a[i]);
            }
        }
        long after = new Date().getTime();

        long used = after - before;
        System.out.println("used = " + used);
    }

    public static void array_sort() {
        int[] array_a = {3, 2, 0, 3, 2, 4, 8, 7};

        long before = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            Arrays.stream(array_a).sorted();
        }
        long after = new Date().getTime();

        long used = after - before;
        System.out.println("used = " + used);

//        Arrays.stream(array_a).sorted().forEach(System.out::println);
    }
}
