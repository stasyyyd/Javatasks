package dvfu.java.tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*2. Пользователь вводит с клавиатуры два дробных числа. Вывести на
экран сумму целых частей и сумму дробных.*/

public class pr2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число ");
        float num1=Float.parseFloat(r.readLine());
        System.out.print("Введите второе число ");
        float num2=Float.parseFloat(r.readLine());
        float sum=num1+num2;
        System.out.printf("Cумма чисел равна = %.2f%n", sum);
        System.out.printf("Cумма чисел равна = %.0f%n", sum);
    }
}
