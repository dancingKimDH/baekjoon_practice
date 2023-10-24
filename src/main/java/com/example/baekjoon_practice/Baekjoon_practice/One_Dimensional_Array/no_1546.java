package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;

import java.util.Scanner;

public class no_1546 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] group = new int[N];

        for(int a = 0; a < N; a ++) {
            group[a] = sc.nextInt();
        }

        int M = 0;
        for(int a = 0; a < N; a++) {
            if(M < group[a]){
                M = group[a];
            } else{
                continue;
            }
        }

        int sum = 0;
        for(int a = 0; a < N; a ++) {
            sum = sum + group[a];
        }

        double result = 0;

// else it will truncate the decimal part!
// cast at least one of the operands to a double :)

        result = (double) sum * 100 / N / M;
        System.out.println(result);

    }
}
