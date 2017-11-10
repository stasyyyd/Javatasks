package dvfu.java.geometry;

/**
 * Created by user on 10.11.2017.
 */
public class Rectangle  extends Shape{
    int a,b;

    @Override
    void draw() {
        super.area();
        String color="красным";
        System.out.println("Рисуем прямоугольник" + " закрашиваем "+color);

    }

    @Override
    void area() {
        super.area();
        int area1=2*this.a+2*this.b;
        System.out.println(" Периметр "+area1);

    }

    @Override
    void square() {
        super.square();
        int square1=this.a*this.b;
        System.out.println("Периметр "+square1);
    }
}
