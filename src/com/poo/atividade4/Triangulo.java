package com.poo.atividade4;

public class Triangulo {
    private int lado;



    private int perimetro;
    private double area;

    public Triangulo(int lado) {
        this.lado = lado;
    }


    public void calcPerimetro() {
        this.perimetro = 3 * this.lado;
    }

    public void  calArea() {
        this.area = this.lado *( (Math.sqrt(3)) / 2);
    }

    public int getLado() {
        return lado;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return Math.round(area);
    }

}
