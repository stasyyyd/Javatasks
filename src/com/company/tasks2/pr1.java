package com.company.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1.Ввести с клавиатуры два 3-значных числа и поменять у них
        средние цифры (например, ввести 357 и 702 – получить и вывести
        числа 307 и 752).*/
public class pr1 {
    public static void main(String[] args) throws IOException {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(r.readLine());
        int num2 = Integer.parseInt(r.readLine());
        int a=num1-(num1%100);
        int b=num2+(num2%100);

       String numStr1=Integer.toString(num1);//преобразование числа в строку
        String numStr2=Integer.toString(num2);

        String firstResult = numStr1.substring(0,1)+numStr2.substring(1,2)+numStr1.substring(2,3);
        //извлекаем из строк подстроки, и складываем их индексы
        String secondResult = numStr2.substring(0,1)+numStr1.substring(1,2)+numStr2.substring(2,3);


    }

}
