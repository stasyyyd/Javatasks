package dvfu.java.tasks8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3. Выведите на экран среднее арифметическое элементов массива, имеющих нечетное
значение.
Ответ выведите с точностью 2 знака после запятой.
Если в массиве нет нечетных элементов, выведите &quot;NO&quot;.*/
public class pr3 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        int sum = 0;
        int g = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(r.readLine());

        }
        for (int a : array) {
            if (a % 2 != 0) {
                sum = sum + a;
                g++;
            }

        }
        if (g <= 0) {
            System.out.println("NO");
        } else {
            System.out.println(sum/g);
        }
    }
}
