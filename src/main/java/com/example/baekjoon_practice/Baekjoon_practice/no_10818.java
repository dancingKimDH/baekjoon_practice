package com.example.baekjoon_practice.Baekjoon_practice;

import java.util.Scanner;

public class no_10818 {
    public static void main(String[] args) {

        // N개의 정수가 주어진다. 
        // 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

        try {

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] n = new int[N];
            for(int i = 0; i < N; i ++) {
                n[i] = sc.nextInt();
            }
            int max = n[0];
            int min = n[0];
            for(int num : n) {
                if(num > max) {
                    max = num;
                }
                if(num < min) {
                    min = num;
                }
            }
            
            System.out.print(min + " " + max);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
