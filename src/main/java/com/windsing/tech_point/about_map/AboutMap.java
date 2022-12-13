package com.windsing.tech_point.about_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class AboutMap {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("a", 2); // HashMap 的 key 不可重复。
        hashMap.put("b", 2);
        hashMap.put("c", null); // HashMap 的 value 可以为 null
        hashMap.put(null, 3); // HashMap 的 key 可以为 null
        System.out.println(hashMap.size()); // 4

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("a", 1);
        linkedHashMap.put("a", 2);
        linkedHashMap.put("b", 2);
        linkedHashMap.put("c", null);
        linkedHashMap.put(null, 3);
        System.out.println(linkedHashMap.size());

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 1);
        treeMap.put("a", 2);
        treeMap.put("b", 2);
        treeMap.put("c", null);
        // treeMap.put(null, 3); // TreeMap 的 key 不可以为 null
        System.out.println(treeMap.size());

    }
}
