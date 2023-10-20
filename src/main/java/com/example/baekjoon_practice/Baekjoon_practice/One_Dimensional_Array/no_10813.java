package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;

import java.util.Scanner;

public class no_10813 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        //  int A[] = new int[N]; 보다 위에 라인이 더 추천됨

        int b = 0;
        int c = 0;

        for(int a = 0; a < N; a++) {
            A[a] = a + 1;
        }

        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            i = i - 1;
            j = j - 1;
            b = A[i];
            c = A[j];
            A[i] = c;
            A[j] = b;
        }
        
        for(int a = 0; a < N; a++) {
            System.out.print(A[a] + " ");

            //  여기서 N 대신 A.length를 사용할 수 있음!

        }
    }
}
