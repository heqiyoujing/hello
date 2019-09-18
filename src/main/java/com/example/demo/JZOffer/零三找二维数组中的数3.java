package com.example.demo.JZOffer;

public class 零三找二维数组中的数3 {

    public static void main(String[] args) {
        int[][] array =  {
                          {2,12,19,44},
                          {5,31,34,55},
                          {7,63,74,85},
                          {10,73,84,98}
                         };
        System.out.println(find(array, 84));
    }

    /**
     在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
     输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     思路：从右上角或左下角开始找，逐行删除，或者用二分法查找
     */
    public static boolean find(int[][] array,int target) {
        if (array == null) {
            return false;
        }
        int row = 0;
        int column = array[0].length-1;

        while (row < array.length && column >= 0) {
            int temp = array[row][column];
            if(array[row][column] == target) {
                return true;
            }
            if(array[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
