package dvfu.java.tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.*;
import java.text.*;

public class pr18 {
    public static void main(String args[]) {
        // Инициализация объекта date
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

        System.out.println("Текущая дата " + formatForDateNow.format(date));
        // Вывод текущей даты и времени с использованием toString()
        System.out.println(date.toString());
    }
}
