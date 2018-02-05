package com.company;

public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(double altura,double base){
        super(altura,base);
    }
    public double perimetro(){
        return 2*base+2*altura;
    }
    public double  area(){
        return base*altura;
    }
}

