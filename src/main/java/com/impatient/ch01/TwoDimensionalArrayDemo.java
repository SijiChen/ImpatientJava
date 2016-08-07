package com.impatient.ch01;

import java.util.Arrays;

/**
 * Created by sjchen on 8/7/16.
 */
public class TwoDimensionalArrayDemo {
    public static void main(String[] arg){
        int[] [] square = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[] temp = square[0];
        square[0]=square[1];
        square[1]=temp;
        System.out.println(Arrays.toString(square));//two dimention will print [[I@4b1210ee, [I@4d7e1886, [I@3cd1a2f1, [I@2f0e140b]
        System.out.println(Arrays.deepToString(square));

        int n =5;
        int [][] triangle = new int[n][];
        for(int i=0;i<n;i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        for(int r=0;r<triangle.length;r++){
            for(int c=0;c<triangle[r].length;c++){
                System.out.printf("%4d", triangle[r][c]);
            }
            System.out.println();
        }
        for(int [] row:triangle){
            for(int element:row){
                System.out.printf("%4d",element);
            }
            System.out.println();
        }

     }


}
