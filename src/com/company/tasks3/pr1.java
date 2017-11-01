package com.company.tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Марафонец прошел S километров со скоростью V метров в секунду
(расстояние и скорость вводятся с клавиатуры). Определить,
сколько времени он был в пути (часов, минут, секунд)?*/

public class pr1 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите расстояние ");
        int S = Integer.parseInt(r.readLine());
        System.out.print("Введите скорость ");
        int V = Integer.parseInt(r.readLine());

        System.out.println("Марафонец был в пути " + S/V + " часа");
    }
}
