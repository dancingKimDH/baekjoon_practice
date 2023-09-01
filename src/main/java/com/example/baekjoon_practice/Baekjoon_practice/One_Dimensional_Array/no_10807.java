package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;

import java.util.Scanner;

public class no_10807 {
    
    public static void main(String[] args) {
        
        try {
            
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int[] list = new int[a];
            for (int i = 0; i < a; i = i + 1) {
                list[i] = sc.nextInt();
            }
            int b = sc.nextInt();
            int result = 0;
            for (int num : list) {
                if (num == b) {
                    result = result + 1;
                }
            }
            System.out.println(result);
            sc.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
