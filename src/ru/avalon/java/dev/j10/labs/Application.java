package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        generateShapes(shapes);
        largestArea(shapes);
    }

    static Shape[] generateShapes(Shape[] s) {
        Random r = new Random();
        for (int i = 0; i < s.length; i++) {
            int j = r.nextInt(3);
            switch (j) {
                case 0:
                    Circle circle = new Circle();
                    System.out.println(circle.getArea());
                    s[i] = circle;
                    break;
                case 1:
                    Triangle triangle = new Triangle();
                    System.out.println(triangle.getArea());
                    s[i] = triangle;
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    System.out.println(rectangle.getArea() + "r");
                    s[i] = rectangle;
                    break;
            }
        }
        return s;
    }

        private static void largestArea (Shape[] shapes){
            Shape largestShape = null;
            for (Shape curShape : shapes) {
                if (largestShape == null || curShape.getArea() > largestShape.getArea())
                    largestShape = curShape;
            }
            System.out.println(largestShape.getClass() + ": " + largestShape.getArea());
        }
}
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
