package com.example.demo.JZOffer;

public class 赋值运算函数1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap1(a, b);
        System.out.println();
        swap2(a, b);
        System.out.println();
        swap3(a, b);
        System.out.println("--------------------->>>>>>>>>>>>>>>>:");
        System.out.println(a);
        System.out.println(b);
    }

    public static void swap1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void swap2(int a,int b)
    {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void  swap3(int a,int b)
    {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }

}