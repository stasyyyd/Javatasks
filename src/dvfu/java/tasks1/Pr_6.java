package dvfu.java.tasks1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pr_6 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int sum=1;
        System.out.println("Введите число = ");
        int num=Integer.parseInt(r.readLine());
        System.out.println("Введите степень = ");
        double s=Integer.parseInt(r.readLine());
        for (int i=0;i<s;i++){
            sum=sum*num;
        }
        if (s<0){
            System.out.println("Число в степени равно = " + Math.pow(num,s));
        }else

            System.out.println("Число в степени равно = " + sum);
    }

}
