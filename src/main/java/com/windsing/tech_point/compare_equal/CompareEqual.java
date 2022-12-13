package com.windsing.tech_point.compare_equal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CompareEqual {

    public static void main(String[] args) {

        String x = "abc";
        String y = "abc";
        String z = new String("abc");

        // == 比较的是内存引用地址，表示变量指向同一个引用
        System.out.println(x == y); // true
        System.out.println(x == z); // false

        // equals 比较的是内存地址中的值
        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // true

        // 比较自定义对象
        CompareObject co = new CompareObject("abc");
        CompareObject co1 = new CompareObject("abc");
        System.out.println(co == co1); // false
        System.out.println(co.equals(co1)); // false


    }
}
