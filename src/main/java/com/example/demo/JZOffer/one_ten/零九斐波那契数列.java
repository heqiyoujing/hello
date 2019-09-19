package com.example.demo.JZOffer.one_ten;

public class 零九斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(Fibonaccik(10));
    }

    /**
     思路：递归的效率低，使用循环方式。
     */
    public static long fibonacci(int n) {
        long result=0;
        long preOne=1;
        long preTwo=0;
        if(n==0) {
            return preTwo;
        }
        if(n==1) {
            return preOne;
        }
        for (int i = 2; i <= n; i++) {
            result = preOne+preTwo;
//            System.out.print(result+ " ");
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    //一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    public static int JumpFloor2(int target) {
        return (int) Math.pow(2,target-1);
    }
    //我们可以用21的小矩形横着或者竖着去覆盖更大的矩形。请问用n个21的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
    public static int Fibonaccik(int n) {
        int number = 1;
        int sum = 1;
        if (n <= 0)
            return 0;
        if (n == 1 ) {
            return 1;
        }

        while (n-- >= 2) {
            sum += number;
            number = sum - number;
//            System.out.println(sum+"    " +number);
        }
        return sum;
    }
}
