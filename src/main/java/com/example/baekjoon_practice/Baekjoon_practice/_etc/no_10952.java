package com.example.baekjoon_practice.Baekjoon_practice._etc;

import java.util.Scanner;

public class no_10952 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int c = 1;

            while (c != 0) {

                int a = sc.nextInt();
                int b = sc.nextInt();
                c = a + b;
                if (c != 0) {
                    System.out.println(c);
                } else {
                    break;
                }

            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
