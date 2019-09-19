package com.example.demo.JZOffer.one_ten;

public class 十整数二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(10));
    }

    /**
     a&(a-1)的结果会将a最右边的1变为0，直到a = 0，还可以先将a&1 != 0，然后右移1位，但不能计算负数的值
     */
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n-1) & n;
        }
        return count;
    }
}
