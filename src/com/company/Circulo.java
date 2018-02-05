package com.company;

public class Circulo extends FiguraGeometrica {
    double radio;
    public Circulo( double altura , double base, double radio){
        super(altura,base);
        this.radio= radio;
    }
    double area(){
        return Math.PI*Math.pow(radio,2);
        }
        double perimetro(){
            return Math.PI*radio;
        }
    }

