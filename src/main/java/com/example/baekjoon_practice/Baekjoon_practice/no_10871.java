package com.example.baekjoon_practice.Baekjoon_practice;

import java.util.Scanner;

public class no_10871 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] sentence = new int[a];
            for (int i = 0; i < a; i++) {
                sentence[i] = sc.nextInt();
            }

            for (int num : sentence) {
                if (num < b) {
                    System.out.print(num + " ");
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
