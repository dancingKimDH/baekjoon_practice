package com.example.baekjoon_practice.Baekjoon_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no_15552 {

    public static void main(String args[]) {
        
        // IOExeption을 Catch해야 함
        try {

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(bf.readLine());

            for(int i = 0; i < N; i = i + 1) {

                // BufferedReader은 String으로 읽음
                String a = bf.readLine();
                int b = Integer.parseInt(a.split(" ")[0]); 
                int c = Integer.parseInt(a.split(" ")[1]);
                bw.write(b + c + "\n");

            }

            // BufferedWriter Flush해 주어야 함
            bw.flush();
            bw.close();
            bf.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

