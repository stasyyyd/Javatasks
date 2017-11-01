package com.company.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*2.Ввести 4-значное число и подсчитать сумму первой и третьей
        цифры и разность второй и четвертой цифры.*/
public class pr2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(r.readLine());
        int a=((num1/1000)%100)+((num1%100)/10);
        int b=((num1%1000)/100)-(num1%10);
        System.out.println(a);
        System.out.println(b);
    }
}
