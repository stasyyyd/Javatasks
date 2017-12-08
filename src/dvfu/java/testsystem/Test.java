package dvfu.java.testsystem;


import java.io.IOException;



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


        System.out.println("Правильных ответов "+options.correctAnswer+" из 5");

        
    }


    @Override
    public void show() {
    System.out.println("Информатика");
    }

    @Override
    public void run() {

    }


    }

