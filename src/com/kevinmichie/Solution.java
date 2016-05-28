package com.kevinmichie;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] numberHolder = new int[sizeOfArray];
        int sumOfArray = 0;
        for(int i = 0; i < sizeOfArray; i++){
            numberHolder[i] = scanner.nextInt();
        }

        for(int j = 0; j < sizeOfArray; j++){
            sumOfArray +=numberHolder[j];
        }

        System.out.println(sumOfArray);
    }
}
