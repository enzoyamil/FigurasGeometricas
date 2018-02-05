package com.company;

  abstract public class FiguraGeometrica {
    double altura;
    double base;
    public FiguraGeometrica(double altura,double base){
        this.altura=altura;
        this.base=base;
    }
     abstract double perimetro();

     abstract double area();
}
