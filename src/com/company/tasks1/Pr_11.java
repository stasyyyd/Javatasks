package com.company.tasks1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pr_11 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double dlina=Integer.parseInt(r.readLine());
        double pi=3.14;
        double radius = dlina*pi;
        System.out.println("Диаметр окружности = :" + " " +radius);

    }
}
