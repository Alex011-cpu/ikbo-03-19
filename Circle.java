package ru.mirea.praktika;
/*Толстов Александр Сергеевич лабораторная №2 вариант №1*/
public class Circle {
    private int r;
    private int d;
    private double length;
    private double area;
    public Circle(){
        r=4;
        d=2*r;
        length=2*3.14*r;
        area=3.14*r*r;
    }
    public int getRadius(){
        return r;
    }
    public int getDiametr(){
        return d;
    }
    public double getLength(){
        return length;
    }
    public  double getArea(){
        return area;
    }
    public void setRadius(int radius){
        r=radius;
    }
    public void setDiametr(int radius){d=2*radius;};
    public void setLength(int radius){length=2*3.14*radius;}
    public void setArea(int raduis){area=3.14*r*r;}
}
