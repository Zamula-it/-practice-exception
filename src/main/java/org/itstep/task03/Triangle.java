package org.itstep.task03;
public class Triangle {
    private final int a;
    private final int b;
    private final int c;
    public Triangle(int a, int b, int c) throws  CreateExep {
        if (((a + b) < c )|| ((b + c) < a) || ((c + a) < b)){
            throw new  CreateExep("Невозможно создать треугольник ");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getSide1() {
        return a;
    }
    public int getSide2() {
        return b;
    }
    public int getSide3() {
        return c;
    }
    @Override
    public String toString() {
        return
                " 1=" + a +
                ",  2=" + b +
                ",  3=" + c;
    }
}
