package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;


import java.util.Scanner;

public class no_3052 {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int[] A = new int[10];

            //  HashSet을 이용해서 풀기
            //  A HashSet is a collection of items where every item is unique
            //  add(), contains(), remove(), clear()

            // HashSet<Integer> group = new HashSet<Integer>();

            // for (int i = 0; i < 10; i++) {
            //     A[i] = sc.nextInt() % 42;
            //     group.add(A[i]);
            // }
            
            // System.out.println(group.size());

            boolean[] group = new boolean[42];

            for(int i = 0; i < 10; i ++) {
                group[A[i] % 42] = true;
            }

            int count = 0;

            for(boolean a : group) {
                if(true) {
                 count = count + 1;   
                }
            }
            sc.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
