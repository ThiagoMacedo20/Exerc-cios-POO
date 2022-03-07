package com.poo.atividade3;

public class Complexo {
    private double a;
    private double b;

    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void soma(Complexo c) {
        this.a += c.a;
        this.b += c.b;
    }

    public void multiplica(Complexo c) {
        this.a = a*c.a - b+c.b;
        this.b = b*c.b + b+c.a;
    }

    public void modulo(Complexo c){
        this.a = a+c.b - Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        this.b = b+c.a - Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    public double argumentoPrincipal(Complexo c){
         return Math.atan2(c.b,c.a);
    }


    @Override
    public String toString() {
        return "(" + Math.round(this.a) + "," + Math.round(this.b) + ")";

    }





}
