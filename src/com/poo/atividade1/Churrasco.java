package com.poo.atividade1;

public class Churrasco {

    private double qtdCarne;

    public double verificarConsumo(Pessoa pessoa){
        if(!pessoa.isVegetariano() && pessoa.getIdade() >= 4 && pessoa.getIdade() <=13){
            this.qtdCarne += 1;

        }else if(!pessoa.isVegetariano() && pessoa.getIdade() > 13){
            this.qtdCarne += 2;
        }
        return qtdCarne;
    }
}
