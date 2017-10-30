package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pr_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;
        float num = 0;
        for (int i=0;i<3;i++){
            float b = Integer.parseInt(r.readLine());
            sum=sum+b;
            num++;
        }

        System.out.println(sum / num);
    }
}
