package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class no_10811 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] group = new int[N];
        int[] aftergroup = new int[N];

        for(int a = 0; a < group.length; a ++) {
            group[a] = a + 1;
            aftergroup[a] = a + 1;
        }

        int M = sc.nextInt();

        for(int a = 0; a <= M; a ++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            for(int z = i - 1; z < j; z ++) {
                aftergroup[z] = group[j-1];
            }
        }

    }
}
