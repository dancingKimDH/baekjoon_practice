package com.example.baekjoon_practice.Baekjoon_practice._etc;

import java.util.Scanner;

public class no_2438 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     int a = 1;
    //     while(a <= N) {
    //         for(int b = 0; b < a; b++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //         a = a + 1;
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = N - 1;
        int a = 1;
        while(a <= N) {
            for(int space = X - a; space >= 0; space--) {
                System.out.print(" ");
            }
            for(int b = 0; b < a; b++) {
                System.out.printf("*");
            }
            System.out.println();
            a = a + 1;
        }
    sc.close();
    }

}
