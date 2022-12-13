package com.windsing.tech_point.about_collection;

import org.openjdk.jol.vm.VM;

import java.util.*;

public class AboutCollection {

    public static void main(String[] args) {

        /*
        ArrayList 和 HashSet 的异同点：
        1、去重：ArrayList 可以添加重复的元素，HashSet 会对添加对元素去重
        2、有序：ArrayList 添加的元素是有序的，HashSet 对添加的元素不保证顺序
        3、ArrayList 和 HashSet 都可以添加 null 值
        4、ArrayList 和 HashSet 的父类（List和Set）都继承 Collection 接口
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add(null);
        System.out.println(arrayList.size()); // 4
//        System.out.println("arrayList 内存地址:" + VM.current().addressOf(arrayList));
//        System.out.println("arrayList 首元素内存地址:" + VM.current().addressOf(arrayList.get(0)));
        List subList = arrayList.subList(1, 2);
        subList.add(3);
        System.out.println(subList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add(null);
        System.out.println(linkedList.size());


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add(null); // HashSet 可以添加 null 值
        System.out.println(hashSet.size()); // 3

        /*
        LinkedHashSet 和 TreeSet 的异同
        1、LinkedHashSet 的元素可以为 null，而 TreeSet 的元素不可以为 null；
        2、LinkedHashSet 添加的元素是有序的，而 TreeSet 会对添加的元素按照自然进行排序
         */
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(3);
        linkedHashSet.add(6);
        linkedHashSet.add(null); // LinkedHashSet 可以添加 null 值
        System.out.println("linkedHashSet: " + linkedHashSet.size()); // 3
        linkedHashSet.stream().forEach(System.out::println);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(6);
        // treeSet.add(null); // TreeSet 不可以添加 null 值
        System.out.println("treeSet: " + treeSet.size());
        treeSet.stream().forEach(System.out::println);

        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("a");
        stringTreeSet.add("a");
        stringTreeSet.add("d");
        stringTreeSet.add("c");
        stringTreeSet.add("b1");
        stringTreeSet.add("b2");
        System.out.println("stringTreeSet: " + stringTreeSet.size());
        stringTreeSet.stream().forEach(System.out::println);

    }
}
