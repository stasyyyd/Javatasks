package dvfu.java.tasks1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int natNum = Integer.parseInt(r.readLine());
        System.out.println(natNum%10);
    }
}