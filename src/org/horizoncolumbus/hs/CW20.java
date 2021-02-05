package org.horizoncolumbus.hs;

public class CW20 {

    public static void main(String[] args) {
        // write your code here
        int Matrix[][] = {{0, 1, 1}, {9, 2, 4}, {9, 0, 4}, {1, 2, 5}};

        for (int i = 0; i < 4; i++) {
                System.out.println("\n");
                for(int j = 0; j < 3; j++){
                    System.out.print(Matrix[i][j] + "\t");

                }
            }
        }}