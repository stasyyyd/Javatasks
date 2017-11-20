package dvfu.java.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by user on 20.11.2017.
 */
public class AppTest {
    public static void main(String[] args) {
        //Выводим наименование теста, вопрос, варианты ответа
        Test testJava=new Test();
        testJava.nameTest="";
        testJava.show();

        Question[] question=new Question[3];

        question[0].TestQuestions="";
        //2
        //3
        Option[] options=new Option[4];
        options[0].testOptions="";
        options[0].correctQuestions=false;
        //2
        //3
         question[0].options=options;
      System.out.println("");
        System.out.println(question[0].TestQuestions);
        System.out.println("");
        int i=0;
        for (TestIf option:question[0].options){
            System.out.println(i++ + "" );
        }
    }
}
