package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;

import java.util.Scanner;

public class no_2562 {

    // 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고
    // 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            int[] A = new int[9];

            for (int i = 0; i < 9; i++) {
                A[i] = sc.nextInt();
            }

            int max = A[0];

            for (int num : A) {
                if (max < num) {
                    max = num;
                }

                // if (max < num) {
                // max = num;
                // }
            }
            int i = 1;
            for (int num : A) {

                if (num < max) {
                    i = i + 1;
                } else {
                    break;
                }

            }

            System.out.println(max);
            System.out.println(i);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
