package dvfu.java.testsystem;

import dvfu.java.test.Option;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{

        Test test=new Test();
        test.show();

        Options options=new Options();
        options.getOptionQuestions();
        options.getOptionQuestions1();
        options.getOptionQuestions2();
        options.getOptionQuestions3();
        options.getOptionQuestions4();


        System.out.println("Правильных ответов "+options.correctAnswer+" из 5");

        //options.getCorrectAnswer();

    }

}
