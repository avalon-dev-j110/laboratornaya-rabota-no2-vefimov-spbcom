package ru.avalon.java.dev.j10.labs.shapes;


public class Circle implements Ellipse {
    private float[] A;
    private float[] B;


    public Circle (){
        this.A = new float[]{generateXY(), generateXY()};
        this.B = new float[]{generateXY(), generateXY()};
    }

    private static float generateXY(){
        return (float)(Math.random() * 5); //если на 10 круг будет всегда по площади больше
    }

    @Override
    public float getArea() {
        return pi * ((float) (Math.pow(getRadius(), 2)));
    }

    @Override
    public float getLength() {
        return 2 * pi * getRadius();
    }

    @Override
    public float getRadius(){
        float x = Math.abs(getX(B) - getX(A));
        float y = Math.abs(getY(B) - getY(A));
        float n = 2f;
        return (float) (Math.sqrt(Math.pow(x, n) + Math.pow(y, n)));
    }

    @Override
    public float getX(float[] a) {
        return a[0];
    }

    @Override
    public float getY(float[] a) {
        return a[1];
    }
}

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
