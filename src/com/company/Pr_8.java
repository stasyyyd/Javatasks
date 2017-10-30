package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pr_8 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int rub=Integer.parseInt(r.readLine());
        double $=rub*58.0833;
        double euro=rub*67.5276;
        System.out.println("Cумма в долларах:" + " " +$);
        System.out.println("Cумма в евро:" + " " +euro);
    }
}
