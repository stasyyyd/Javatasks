package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 28.10.2017.
 */
public class Pr_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввведите количество градусов = ");
        double C = Integer.parseInt(r.readLine());

        double F = (C * 1.8) + 32;
        System.out.println("Количество градусов по фаренгейту = " +F );

        double K = C + 273.15;
        System.out.println("Количество градусов по Кельвину = "+K );

        double R = 0.8 * C;
        System.out.println("Количество градусов по Реомюру = "+R );

        double D = (100 - C) * 1.5;
        System.out.println("Количество градусов по Делилю = "+D );
        double FinC = ((F - 32)/1.8);
        System.out.println("Количество градусов по Цельсию = " +FinC);

    }
}
