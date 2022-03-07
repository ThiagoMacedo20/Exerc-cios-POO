package com.poo.atividade1;

public class Pessoa {
    private String name;
    private String sexo;
    private int idade;
    private boolean vegetariano;



    public Pessoa(String name, String sexo, int idade, boolean vegetariano) {
        this.name = name;
        this.sexo = sexo;
        this.idade = idade;
        this.vegetariano = vegetariano;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public String getName() {
        return name;
    }

    public String getSexo() {
        return sexo;
    }
}
