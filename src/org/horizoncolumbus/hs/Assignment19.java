package org.horizoncolumbus.hs;

public class Assignment19 {
    public static void main(String[] args) {
        int arr[][] = {{8,7,9}, {3,7,5}, {7,4,4}};
        int[][] arr2 = new int[3][3];

        arr2[0][0] = 2;
        arr2[0][1] = 7;
        arr2[0][2] = 9;

        arr2[1][0] = 3;
        arr2[1][1] = 6;
        arr2[1][2] = 1;

        arr2[2][0] = 7;
        arr2[2][1] = 4;
        arr2[2][2] = 2;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                System.out.println(arr[i][j]);
            }
        }

    }}
