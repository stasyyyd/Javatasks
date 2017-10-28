package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 28.10.2017.
 */
public class Pr_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первую переменную = ");
        int a = Integer.parseInt(r.readLine());
        System.out.println("Введите вторую переменную = ");
        int b = Integer.parseInt(r.readLine());
        System.out.println(a);
        System.out.println(b);
        a += 2 * (b - a);
        b -= (a - b);
        a -= (a - b) / 2;
        System.out.println(a);
        System.out.println(b);

    }
}
