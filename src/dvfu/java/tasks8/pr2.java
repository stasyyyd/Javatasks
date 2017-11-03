package dvfu.java.tasks8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 03.11.2017.
 */

/*2. Выведите на экран сумму четных элементов массива.
Если в массиве нет четных элементов, выведите NO*/
public class pr2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        int sum = 0;
        int g = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(r.readLine());

        }
        for (int a : array) {
            if (a % 2 == 0) {
                sum = sum + a;
                g++;
            }

        }
        if (g <= 0) {
            System.out.println("NO");
        } else {
            System.out.println(sum);
        }
    }
}
