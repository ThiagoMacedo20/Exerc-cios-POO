package com.poo.atividade5;

public class Advinha {

    public double sortear(){
        return Math.round((Math.random()*100));
    }

    public String advinhacao( double numeroSorteado){
        double sorteado = sortear();
        if( numeroSorteado == sorteado){
            return "acertou";
        } else
            return "errou";
    }
}
