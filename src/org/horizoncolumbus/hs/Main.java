package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[][] = {{8,7,9}, {3,7,5}, {7,4,4}};

        for(int i = 0; i < 3; i++){
            for(int j = 0;j < 3; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
