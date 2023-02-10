package com.windsing.tech_point.about_string;

import java.util.Arrays;
import java.util.Locale;

public class AboutString {

    public static void main(String[] args) {
        String string = "ABC is not Chinese.";

        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.substring(3));
        System.out.println(string.substring(0, 3)); // 相当于数学的这个包含关系[,)
        Arrays.stream(string.split(" ")).forEach(System.out::println);
        System.out.println(string.indexOf("h"));
        System.out.println(string.indexOf("e"));

        StringBuilder stringBuilder = new StringBuilder("qwe");
        stringBuilder.append("abc");

        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("qwe");

    }
}
