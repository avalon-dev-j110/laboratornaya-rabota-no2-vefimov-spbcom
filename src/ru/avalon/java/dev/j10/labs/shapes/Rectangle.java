package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {
    private float[] A;
    private float[] B;
    private float[] C;
    private float[] D;

    public Rectangle (){
        this.A = new float[]{generateXY(), generateXY()};
        this.B = new float[]{getX(A), generateXY()};
        this.C = new float[]{generateXY(), getY(B)};
        this.D = new float[]{getX(C), getY(A)};
    }

    private static float generateXY(){
        return (float)(Math.random() * 20);
    }


    @Override
    public float getPerimeter() {
        return 2 * (getSection(A, B) + getSection(B, C));
    }

    @Override
    public float getSection(float[] a, float[] b) {
        float x = Math.abs(getX(b) - getX(a));
        float y = Math.abs(getY(b) - getY(a));
        return (float) (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    @Override
    public float getArea() {
        return getSection(A, B) * getSection(B, C);
    }


    @Override
    public float getX(float[] a) {
        return a[0];
    }

    @Override
    public float getY(float[] a) {
        return a[1];
    }

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
