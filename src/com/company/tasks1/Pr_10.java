package com.company.tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 28.10.2017.
 */
public class Pr_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число = ");
        int a = Integer.parseInt(r.readLine());
        System.out.println("Введите второе число = ");
        int b = Integer.parseInt(r.readLine());

        int S=a+b;
        System.out.println("Введите % = ");
        int P = Integer.parseInt(r.readLine());

        int P2=((S/100)*P);
        System.out.println("процент от суммы = "+P2);
    }
}
