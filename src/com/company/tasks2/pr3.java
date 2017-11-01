package com.company.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3.Ввести с клавиатуры 3-значное число и удалить из него среднюю
цифру (например, ввести 3, 5, 7 – получить и вывести число 37).*/

public class pr3 {
    public static void main(String[] args) throws IOException{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(r.readLine());
        int b=num1%10;
        int a=num1%100;
        int c=(num1-a)/10;

        System.out.println(c+b);
    }
}
