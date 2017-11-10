package dvfu.java.geometry;

/**
 * Created by user on 10.11.2017.
 */
public class Circle extends Shape {
    int y,x;



    void draw(){
       System.out.println("Рисуем окружность");
    }

    @Override
    void area() {
        super.area();
        int d=2*x+y*2;
        System.out.println("Диаметр окружности = "+d);
    }

    @Override
    void square() {
        super.square();
        int p=x*y;
        System.out.println("Площадь равна ="+p);
    }
}
