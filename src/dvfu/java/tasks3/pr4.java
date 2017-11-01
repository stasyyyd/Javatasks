package dvfu.java.tasks3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*4.Пользователь вводит с клавиатуры массу в тоннах (дробное число).
Вывести по отдельности количество тонн, килограмм, грамм
(например, ввести 126.456789т - получить и вывести 126т 456кг
789г)*/
public class pr4 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader r  = new BufferedReader( new InputStreamReader(System.in));
        Double digit = Double.parseDouble(r.readLine());
        String StrDigit=Double.toString(digit);
        System.out.print(StrDigit.substring(0,3) + " т ");
        System.out.print(StrDigit.substring(4,7) + " кг ");
        System.out.print(StrDigit.substring(7,10) + " г ");

    }
}
