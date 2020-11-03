package ru.avalon.java.dev.j10.labs.shapes;


public class Triangle implements Polygon{
    private float[] A;
    private float[] B;
    private float[] C;

    public Triangle (){
        this.A = new float[]{generateXY(), generateXY()};
        this.B = new float[]{generateXY(), generateXY()};
        this.C = new float[]{generateXY(), generateXY()};
    }

    private static float generateXY(){
        return (float)(Math.random() * 10);
    }


    @Override
    public float getPerimeter() {
        return getSection(A, B) + getSection(B, C) + getSection(A, C);
    }

    @Override
    public float getSection(float[] a, float[] b) {
        float x = Math.abs(getX(b) - getX(a));
        float y = Math.abs(getY(b) - getY(a));
        return (float) (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    @Override
    public float getArea() {
        float p = getPerimeter() / 2;
        float a = getSection(A, B);
        float b = getSection(B, C);
        float c = getSection(A, C);
        return (float) (Math.sqrt(p * (p - a)) * (p - b) * (p - c));
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
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
/*
 * TODO: Реализовать класс 'Triangle'
 * 1. Используйте наследование.
 * 2. Реализуйте все абстрактные методы.
 */
