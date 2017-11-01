package dvfu.java.tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*3. Пользователь вводит с клавиатуры сумму в гривнах (дробное
число). Вывести по отдельности количество гривен и количество
копеек (например, ввести 45.67 гривен - получить и вывести 45
гривен 67 копеек)*/
public class pr3 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double mon=Double.parseDouble(r.readLine());
        String gr=Double.toString(mon);
        System.out.print( gr.substring(0,2)+ " гривен ");
        System.out.print(gr.substring(3,5)+ " копеек ");
    }
}
