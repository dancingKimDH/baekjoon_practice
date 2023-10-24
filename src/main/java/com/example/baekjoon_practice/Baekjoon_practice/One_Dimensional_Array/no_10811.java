package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class no_10811 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] group = new int[N];

        for(int a = 0; a < group.length; a ++) {
            group[a] = a + 1;
        }
        int t = 0;
        int M = sc.nextInt();
        for(int a = 0; a < M; a ++) {
            int i = sc.nextInt(); 
            int j = sc.nextInt();
            for(int x = i; x < j - 1; x ++ ){
                t = group[i - 1];
                group[i - 1] = group[j - x];
                group[j - x] = t;
                System.out.println("round completed");
            }
        }

        for(int a = 0; a < group.length; a ++) {
            System.out.println(group[a]);
        }

    }
}
