package com.example.baekjoon_practice.Baekjoon_practice.One_Dimensional_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class no_5597 {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            // 30개의 빈 공간을 갖는 Array
            int[] A = new int[5];
            int[] list = new int[2];
            ArrayList<Integer> C = new ArrayList<Integer>();

            int B = A.length - 2;

            for (int i = 0; i < A.length; i++) {
                A[i] = i + 1;
            }

            for (int i = 0; i < B; i++) {
                int a = sc.nextInt();
                int b = a - 1;
                A[b] = 0;
            }

            for (int i = 0; i < A.length; i++) {
                int a = A[i];
                if(a != 0) {
                    C.add(A[i]);
                }
            }

            int z = C.get(0);
            int x = C.get(1);
            if(z > x) {
                System.out.println(x);
                System.out.println(z);
            } else {
                System.out.println(z);
                System.out.println(x);
            }

            sc.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}


//  다른 방법
//  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // boolean[] arr = new boolean[31];
        // //온 사람은 출석 체크
        // for (int i = 0; i < 28; i++) {
        //     int n = Integer.parseInt(br.readLine());
        //     arr[n] = true;
        // }
        // for (int i = 1; i <= 30; i++) {
        //     if (!arr[i]) System.out.println(i);  //불리지 않은 사람 출력
        // }

        //  배열의 숫자들을 true/false로 반환한 후, if문을 돌려 아닌 경우를 출력한다.
        //  이렇게 쉬운 문제였니 ㅠㅜ

        // 꼭 true가 아니어도 예를 들어 숫자 100으로 바꾼 후 100이 아닌 경우를 출력할 수도 있음!