package dvfu.java.tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.*;

/*Какая дата будет через N дней? Рекомендуется
использование типа GregorianCalendar.*/

public class pr18 {
    public static void main(String args[]) throws IOException {
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ввведите количество дней ");
      int day=Integer.parseInt(r.readLine());// Инициализация объекта date

        Calendar c = new GregorianCalendar();
        c.add(Calendar.DAY_OF_MONTH, +day);
        SimpleDateFormat formatDate = new SimpleDateFormat("E dd.MM.yyyy г.");
        Date date = c.getTime();
        System.out.println("Через " + day + " дней будет "+formatDate.format(date));
    }
}
