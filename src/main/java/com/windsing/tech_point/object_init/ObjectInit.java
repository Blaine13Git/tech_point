package com.windsing.tech_point.object_init;

public class ObjectInit {

    static int a = 111; // 静态成员变量

    static {
        System.out.println("静态代码块：" + a);
    }

    int b = 222; // 普通成员变量

    {
        System.out.println("构造代码块：" + b);
        b = 333;
    }

    ObjectInit() {
        System.out.println("构造方法：" + b);
    }

    public static void main(String[] args) {
        new ObjectInit();
    }
}
