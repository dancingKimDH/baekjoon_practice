package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;

import java.util.Scanner;

public class no_10811 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] group = new int[N];

        for (int a = 0; a < group.length; a++) {
            group[a] = a + 1;
        }
        int t = 0;
        int M = sc.nextInt();
        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int m = i - 1;
            int n = j - 1;
            while (m < n) {
                t = group[m];
                group[m] = group[n];
                group[n] = t;
                m++;
                n--;
            }
        }

        for (int a = 0; a < group.length; a++) {
            System.out.println(group[a]);
        }

        sc.close();

    }
}
