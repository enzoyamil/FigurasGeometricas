package com.company;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(double base,double altura){
       super(altura,base);
    }
    public double perimetro(){
        double perimetro = altura*2+base*2;
        return perimetro;
    }
    public double area(){
        double area= altura*base;
        return area;
    }
}
