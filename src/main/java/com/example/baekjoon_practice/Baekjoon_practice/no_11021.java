package com.example.baekjoon_practice.Baekjoon_practice;

import java.util.Scanner;

public class no_11021 {


    // scanner.nextInt()로 간략화
    public static void newtry(String[] args) {

        try {
            
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            
            for(int a = 0; a < N; a = a + 1) {
                int b = scanner.nextInt();
                int c = scanner.nextInt();

                int e = a + 1;

                System.out.println("Case #" + e + ": " + (b + c));

            }
            scanner.close();

        } catch (Exception e) {
         System.out.println(e.getMessage());
        }

    }

    // 초반 시도: 굉장히 복잡하게 풀이함
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            int N = Integer.parseInt(scanner.nextLine());

            for (int a = 0; a < N; a++) {

                String X = scanner.nextLine();

                int b = Integer.parseInt(X.split(" ")[0]);
                int c = Integer.parseInt(X.split(" ")[1]);
                int d = b + c;
                int e = a + 1;
                System.out.println("Case #" + e + ": " + d);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}


