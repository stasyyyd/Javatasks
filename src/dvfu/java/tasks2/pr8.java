package dvfu.java.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*8.Ввести с клавиатуры 3-значное число и «перевернуть» его
(например, ввести 357 – получить и вывести 753).*/

public class pr8 {
    public static void main(String[] args) throws IOException {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(r.readLine());
        int a=num1%10;
        int b=(num1/10)%10;
        int c=(num1/100)%10;

        System.out.println(a + ""+ b + "" + c);
    }
}
