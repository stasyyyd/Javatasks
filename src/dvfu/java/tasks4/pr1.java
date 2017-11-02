package dvfu.java.tasks4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr1 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(r.readLine());
        if(num%2==0){
            System.out.println("Число "+num+" четное");}
            else{
                System.out.println("Число "+num+" нечетное");
            }
        }
    }

