package com.example.baekjoon_practice.Baekjoon_practice.String_Literal;

import java.util.Scanner;

public class no_2743 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();

        char[] group = ln.toCharArray();

        int count = 0;

        for (char a : group) {
            count++;
        }

        System.out.println(count);
        sc.close();
    }

}
