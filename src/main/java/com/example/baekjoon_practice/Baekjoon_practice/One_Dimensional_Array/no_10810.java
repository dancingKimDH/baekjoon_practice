package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;

import java.util.Scanner;

public class no_10810 {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] array = new int[N];

            for (int a = 0; a < M; a++) {
                int i = sc.nextInt();
                int j = sc.nextInt();
                int k = sc.nextInt();
                for (int b = i - 1; b < j; b++) {
                    array[b] = k;
                }
            }
            for (int num : array) {
                System.out.print(num + " ");
            }
            sc.close();
        } catch (Exception e) {

        }

    }

}

// BufferedReader로 푼 경우
// https://codingnight.tistory.com/44

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;

// import java.util.StringTokenizer;

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer로
// N과 M, " "(공백)으로 구분

// int N = Integer.parseInt(st.nextToken());
// int[] arr = new int[N];
// int M = Integer.parseInt(st.nextToken());

// for(int i = 0;i<M;i++) {
// st = new StringTokenizer(br.readLine()); // StringTokenizer로 " "(공백)으로 구분

// int I = Integer.parseInt(st.nextToken());
// int J = Integer.parseInt(st.nextToken());
// int K = Integer.parseInt(st.nextToken());

// for (int j = I - 1; j < J; j++) {
// arr[j] = K;
// }
// } for(int k = 0;k<arr.length;k++)
// {
// bw.write(arr[k] + " ");
// }
// br.close();
// bw.flush();
// bw.close();
