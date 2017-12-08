package dvfu.java.testsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Questions implements TestSystem {

    ArrayList<String> questions =new ArrayList<>();


public ArrayList<String> getQuestions() throws IOException {
        questions.add(0,"Производительность работы компьютера (быстрота выполнения операций) зависит от");
        questions.add(1,"За единицу измерения количества информации принят");
        questions.add(2,"Какое устройство может оказывать вредное воздействие на здоровье человека?");
        questions.add(3,"Основным элементом базы данных является");
        questions.add(4,"Заражение компьютерными вирусами может произойти в процессе");

    return questions;
}

    @Override
    public void show() {

    }

    @Override
    public void run() {

    }
}
