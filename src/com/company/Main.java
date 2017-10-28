package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int sum=1;

        int num=Integer.parseInt(r.readLine());
        double s=Integer.parseInt(r.readLine());
        for (int i=0;i<s;i++){
            sum=sum*num;
        }
        if (s<0){
            double sum2=(1/sum);
            System.out.println(sum2);
        }else

            System.out.println(sum);
    }

}
