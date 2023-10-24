package com.example.baekjoon_practice.Baekjoon_practice.String_Literal;

import java.util.Scanner;

public class no_27866 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();

        char[] charArray = S.toCharArray();
        System.out.println(charArray[i - 1]);
    }
    
}
