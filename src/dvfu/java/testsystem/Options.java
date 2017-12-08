package dvfu.java.testsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Options implements TestSystem{

    int correctAnswer;
    ArrayList<String> optionQuestions =new ArrayList<>();
    ArrayList<String> optionQuestions1 =new ArrayList<>();
    ArrayList<String> optionQuestions2 =new ArrayList<>();
    ArrayList<String> optionQuestions3 =new ArrayList<>();
    ArrayList<String> optionQuestions4 =new ArrayList<>();
    Questions questions=new Questions();


    public ArrayList<String> getOptionQuestions() throws IOException{

        System.out.println(questions.getQuestions().get(0));

        optionQuestions.add(0, "1. размера экрана дисплея");
        optionQuestions.add(1, "2.  частоты процессора");
        optionQuestions.add(2, "3. напряжения питания");
        optionQuestions.add(3, "4. быстроты нажатия на клавиши");

        for (int i=0;i<optionQuestions.size();i++){
            System.out.println(optionQuestions.get(i));
        }
        System.out.println("Введите номер варианта: ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(r.readLine());
            if (answer==2){
                System.out.println("ВЕРНО");
                correctAnswer++;
            }
            else {
                System.out.println("НЕВЕРНО");

            }


        return optionQuestions;
    }
    public ArrayList<String> getOptionQuestions1() throws IOException {
        System.out.println(questions.getQuestions().get(1));
        optionQuestions1.add(0,"1. Кбайт");
        optionQuestions1.add(1,"2. бит");
        optionQuestions1.add(2,"3. байт");


        for (int i=0;i<optionQuestions1.size();i++){
            System.out.println(optionQuestions1.get(i));
        }
        System.out.println("Введите номер варианта: ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int answer1 = Integer.parseInt(r.readLine());
        if (answer1==2){
            System.out.println("ВЕРНО");
            correctAnswer++;
        }
        else {
            System.out.println("НЕВЕРНО");
        }
        return optionQuestions1;
    }

    public ArrayList<String> getOptionQuestions2() throws IOException{
        System.out.println(questions.getQuestions().get(2));
        optionQuestions2.add(0,"1. принтер");
        optionQuestions2.add(1,"2. монитор");
        optionQuestions2.add(2,"3. системный блок");
        optionQuestions2.add(3,"4. модем");

        for (int i=0;i<optionQuestions2.size();i++){
            System.out.println(optionQuestions2.get(i));
        }
        System.out.println("Введите номер варианта: ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(r.readLine());
        if (answer==2){
            System.out.println("ВЕРНО");
            correctAnswer++;
        }
        else {
            System.out.println("НЕВЕРНО");

        }

        return optionQuestions2;
    }

    public ArrayList<String> getOptionQuestions3() throws IOException {
        System.out.println(questions.getQuestions().get(3));
        optionQuestions3.add(0,"1. поле");
        optionQuestions3.add(1,"2. форма");
        optionQuestions3.add(2,"3. таблица");
        optionQuestions3.add(3,"4. запись");

        for (int i=0;i<optionQuestions3.size();i++){
            System.out.println(optionQuestions3.get(i));
        }
  System.out.println("Введите номер варианта: ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(r.readLine());
        if (answer==1){
            System.out.println("ВЕРНО");
            correctAnswer++;
        }
        else {
            System.out.println("НЕВЕРНО");

        }

        return optionQuestions3;
    }

    public ArrayList<String> getOptionQuestions4() throws IOException{
        System.out.println(questions.getQuestions().get(4));
        optionQuestions4.add(0,"1. печати на принтере");
        optionQuestions4.add(1,"2. работы с файлами");
        optionQuestions4.add(2,"3. форматирования дискеты");
        optionQuestions4.add(3,"4. выключения компьютера");

        for (int i=0;i<optionQuestions4.size();i++){
            System.out.println(optionQuestions4.get(i));}
            System.out.println("Введите номер варианта: ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(r.readLine());
        if (answer==2){
            System.out.println("ВЕРНО");
            correctAnswer++;
        }
        else {

            System.out.println("НЕВЕРНО");

        }

        return optionQuestions4;
    }


    @Override
    public void show() {

    }

    @Override
    public void run() {

    }
}
