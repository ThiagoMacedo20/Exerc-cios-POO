package com.poo.atividade6;

public class Eq2Grau {

    private double a, b, c;

    public Eq2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double raiz1() {
        double valorRaiz = (-1 * this.b)  + Math.sqrt(delta()) / 2* this.a;

        if(valorRaiz < 0){
            return Double.NaN;
        }
        return Math.round(valorRaiz);
    }

    public double raiz2() {
        double valorRaiz = (-1 * this.b) - Math.sqrt(delta()) / 2* this.a;

        if(valorRaiz < 0){
            return Double.NaN;
        }
        return Math.round(valorRaiz);
    }

}
