package com.example.baekjoon_practice.Baekjoon_practice;

import java.util.Scanner;

public class no_10951 {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            int A = 1;

            while (A < 2) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a + b;
            System.out.println(c);
        }

        sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }

}
