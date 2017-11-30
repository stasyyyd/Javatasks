package dvfu.java.testsystem;

import dvfu.java.test.Option;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{

        /*Test test=new Test();
        test.show();

        Options options=new Options();
        options.getOptionQuestions();
        System.out.println("Введите номер варианта: ");

        /*options.getOptionQuestions1();
        System.out.println("Введите номер варианта: ");

        options.getOptionQuestions2();
        System.out.println("Введите номер варианта: ");

        options.getOptionQuestions3();
        System.out.println("Введите номер варианта: ");

        options.getOptionQuestions4();
        System.out.println("Введите номер варианта: ");*/

         FileInputStream fileInputStream =new FileInputStream("c:/test/Test.txt");
         BufferedReader r=new BufferedReader(new InputStreamReader(fileInputStream));

        ArrayList<String> list=new ArrayList<>();
        while (r.ready()){
            list.add(r.readLine());
        }
        for (String s:list){
            System.out.println(s);
        }
        /*options.getCorrectAnswer();*/

    }

}
