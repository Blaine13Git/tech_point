package com.windsing.tech_point.object_size;

import org.apache.lucene.util.RamUsageEstimator;

public class ObjectSize {

    static int a = 2147483647; // int占4个byte，每个字节8bit，共32bit，即2^32（2的32次方）= 4294967296，其中正负数各一半，即4294967296/2=2147483648-1=2147483647
    static int b = 22; // int占4个byte，每个字节8bit，共32bit，即2^32（2的32次方）= 4294967296，其中正负数个一半，即4294967296/2=2147483648-1=2147483647

    static String str_001 = "abc";
    static String str_002 = "abcdef";
    static String str_003 = "abcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdefabcdef";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(a + 1);

        //Returns the shallow instance size in bytes an instance of the given class would occupy.
        System.out.println("a size = " + RamUsageEstimator.shallowSizeOf(a));
        System.out.println("b size = " + RamUsageEstimator.shallowSizeOf(b));
        System.out.println("str_001 size = " + RamUsageEstimator.shallowSizeOf(str_001));
        System.out.println("str_002 size = " + RamUsageEstimator.shallowSizeOf(str_002));
        System.out.println("str_003 size = " + RamUsageEstimator.shallowSizeOf(str_003));
    }
}

