package dvfu.java.testsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Questions implements TestSystem {

    ArrayList<String> questions =new ArrayList<>();


public ArrayList<String> getQuestions() throws IOException {
        questions.add(0,"Вопрос 1");
        questions.add(1,"Вопрос 2");
        questions.add(2,"Вопрос 3");
        questions.add(3,"Вопрос 4");
        questions.add(4,"Вопрос 5");

    return questions;
}

    @Override
    public void show() {

    }

    @Override
    public void run() {

    }
}
