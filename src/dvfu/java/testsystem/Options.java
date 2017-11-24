package dvfu.java.testsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Options implements TestSystem {
    String nameOption;
    String correctAnswer;
    ArrayList<String> optionQuestions = new ArrayList<>();

    Questions question = new Questions();

    int score;

    public ArrayList<String> getOptionQuestions() throws IOException {
        System.out.println(question.getQuestions().get(0));
        optionQuestions.add(0, "1. Вариант ответа 1");
        optionQuestions.add(1, "2. Вариант ответа 2");
        optionQuestions.add(2, "3. Вариант ответа 3");
        optionQuestions.add(3, "4. Вариант ответа 4");

        for (int i = 0; i < optionQuestions.size(); i++) {
            System.out.println(optionQuestions.get(i));
        }

        return optionQuestions;
    }

    public String getCorrectAnswer() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(r.readLine());

        if (answer == 2) {
            System.out.println("Ответ верный");
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
