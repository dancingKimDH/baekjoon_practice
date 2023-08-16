package com.example.baekjoon_practice.Baekjoon_practice;

import java.util.Scanner;

public class no_11022 {

    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();

            for (int a = 0; a < N; a++) {

                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = b + c;
                int e = a + 1;
                System.out.println("Case #" + e + ": " + b + " + " + c + " = " + d);

            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
