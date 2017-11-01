package dvfu.java.tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anastasia on 27.10.2017.
 */
public class Pr_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(r.readLine());
        int num2=((num/10)%10);

        System.out.println(num2);
    }
}
