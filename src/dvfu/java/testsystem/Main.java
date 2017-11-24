package dvfu.java.testsystem;

import dvfu.java.test.Option;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        Test test=new Test();
        test.show();

        Options options=new Options();

        options.getOptionQuestions();
     

        System.out.print("Введите номер варианта: ");

        options.getCorrectAnswer();
    }

}
