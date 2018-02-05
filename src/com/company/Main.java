package com.company;

public class Main {

    public static void main(String[] args) {
        FiguraGeometrica r;
        FiguraGeometrica c;
        FiguraGeometrica ci;
        r =new Rectangulo(5,2);
        c=new Cuadrado(2,3);
        ci=new Circulo(4,4,2);
        System.out.println("el perimetro del rectangulo es:"+r.perimetro());
        System.out.println("el area del rectangulo es:"+r.area());
        System.out.println("el perimetro del cuadrado es:"+c.perimetro());
        System.out.println("el area del cuadrado es:"+c.area());
        System.out.println("el perimetro del circulo es:"+ci.perimetro());
        System.out.println("el area del circulo es:"+ci.area());
    }
}
