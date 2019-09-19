package com.example.demo.JZOffer.eleven_twenty;

public class 一一数值的整数次方 {
    public static void main(String[] args) {
        double num = Power(0.01,4);
        System.out.println(num);
    }

    //思路：不能用==比较两个浮点数是否相等，因为有误差。考虑输入值的多种情况。
    public static double Power(double base, int exponent) {
        double res = 0;
        if (equal(base,0)) {
            return 0;
        }
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent > 0) {
            res = mutiply(base,exponent);
        }else {
            res = mutiply(1/base,-exponent);
        }
        return res;
    }

    public static double mutiply(double base, int e) {
        double sum = 1;
        for (int i = 0; i < e; i++) {
            sum = sum * base;
        }
        return sum;
    }

    public static boolean equal(double a, double b) {
        if (a - b < 0.000001 && a - b > -0.000001) {
            return true;
        }
        return false;
    }
}
