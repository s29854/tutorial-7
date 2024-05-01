import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Figure circle = new Circle(3.0);

        Figure parallelogram = new Parallelogram(10,5,8);

        Figure rectangle = new Rectangle(15, 10);

        List<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
            }
        }
}