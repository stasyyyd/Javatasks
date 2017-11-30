package dvfu.java.testsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Options implements TestSystem{
    String nameOption;
    String correctAnswer;
    ArrayList<String> optionQuestions =new ArrayList<>();
    ArrayList<String> optionQuestions1 =new ArrayList<>();
    ArrayList<String> optionQuestions2 =new ArrayList<>();
    ArrayList<String> optionQuestions3 =new ArrayList<>();
    ArrayList<String> optionQuestions4 =new ArrayList<>();
    Questions questions=new Questions();
    int score;

    public ArrayList<String> getOptionQuestions() {

        System.out.println(questions.getQuestions().get(0));

        optionQuestions.add(0, "1. Вариант ответа 1");
        optionQuestions.add(1, "2. Вариант ответа 2");
        optionQuestions.add(2, "3. Вариант ответа 3");
        optionQuestions.add(3, "4. Вариант ответа 4");

        for (int i=0;i<optionQuestions.size();i++){
            System.out.println(optionQuestions.get(i));
        }

        return optionQuestions;
    }
    /*public ArrayList<String> getOptionQuestions1() {
        System.out.println(questions.getQuestions().get(1));
        optionQuestions1.add(0,"1. Вариант ответа 1");
        optionQuestions1.add(1,"2. Вариант ответа 2");
        optionQuestions1.add(2,"3. Вариант ответа 3");
        optionQuestions1.add(3,"4. Вариант ответа 4");

        for (int i=0;i<optionQuestions1.size();i++){
            System.out.println(optionQuestions1.get(i));
        }

        return optionQuestions1;
    }

    public ArrayList<String> getOptionQuestions2() {
        System.out.println(questions.getQuestions().get(2));
        optionQuestions2.add(0,"1. Вариант ответа 1");
        optionQuestions2.add(1,"2. Вариант ответа 2");
        optionQuestions2.add(2,"3. Вариант ответа 3");
        optionQuestions2.add(3,"4. Вариант ответа 4");

        for (int i=0;i<optionQuestions2.size();i++){
            System.out.println(optionQuestions2.get(i));
        }


        return optionQuestions2;
    }
    public ArrayList<String> getOptionQuestions3() {
        System.out.println(questions.getQuestions().get(3));
        optionQuestions3.add(0,"1. Вариант ответа 1");
        optionQuestions3.add(1,"2. Вариант ответа 2");
        optionQuestions3.add(2,"3. Вариант ответа 3");
        optionQuestions3.add(3,"4. Вариант ответа 4");

        for (int i=0;i<optionQuestions3.size();i++){
            System.out.println(optionQuestions3.get(i));
        }


        return optionQuestions3;
    }
    public ArrayList<String> getOptionQuestions4() {
        System.out.println(questions.getQuestions().get(4));
        optionQuestions4.add(0,"1. Вариант ответа 1");
        optionQuestions4.add(1,"2. Вариант ответа 2");
        optionQuestions4.add(2,"3. Вариант ответа 3");
        optionQuestions4.add(3,"4. Вариант ответа 4");

        for (int i=0;i<optionQuestions4.size();i++){
            System.out.println(optionQuestions4.get(i));
        }
        return optionQuestions4;
    }
    */
    public String getCorrectAnswer() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(r.readLine());
        /*int answer1 = Integer.parseInt(r.readLine());
        int answer2 = Integer.parseInt(r.readLine());
        int answer3 = Integer.parseInt(r.readLine());
        int answer4 = Integer.parseInt(r.readLine());*/
          if (answer==2/*||answer1==3||answer2==2||answer3==2||answer4==4*/){
            System.out.println("Ответ верный");
            score++;
        } else {
            System.out.println("Неверно");
        }

        return correctAnswer;
    }

    @Override
    public void show() {

    }

    @Override
    public void run() {

    }
}
