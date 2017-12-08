package dvfu.java.testsystem;


import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Test implements TestSystem {
    public static void main(String[] args) throws IOException{

        Test test=new Test();
        test.show();

        Options options=new Options();
        options.getOptionQuestions();
        options.getOptionQuestions1();
        options.getOptionQuestions2();
        options.getOptionQuestions3();
        options.getOptionQuestions4();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Правильных ответов "+options.correctAnswer+" из 5");
        System.out.println("Количество баллов "+options.score);
        if (options.score<=2){
            System.out.println("ТЕСТ НЕ ПРОЙДЕН!");
        } else {
            System.out.println("ТЕСТ ПРОЙДЕН!");
        }


    }


    @Override
    public void show() {
        Date date =new Date();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy 'и время' hh:mm:ss ");
            System.out.println("Дата прохождения теста: " + formatForDateNow.format(date));
            System.out.println("Тема теста: Информатика"+"\n");

    }

    @Override
    public void run() {

    }


    }

