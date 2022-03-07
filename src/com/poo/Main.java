package com.poo;

import com.poo.atividade1.Churrasco;
import com.poo.atividade1.Pessoa;
import com.poo.atividade2.Lampada;
import com.poo.atividade3.Complexo;
import com.poo.atividade4.Triangulo;
import com.poo.atividade5.Advinha;
import com.poo.atividade6.Eq2Grau;
import com.poo.atividade7.Porta;

public class Main {

    public static void main(String[] args) {
        System.out.println("Atividade 1.1");
        Pessoa pessoa = new Pessoa("Cleonice Oliveira Machado","Feminino",23,false);
        Churrasco churrasco = new Churrasco();
        System.out.println(pessoa.getName() + " idade:"+ pessoa.getIdade());
        System.out.println("Consumo de carne:" + churrasco.verificarConsumo(pessoa));

        System.out.println("Atividade 1.2");
        Lampada lampada = new Lampada();
        lampada.clickInterruptor();
        System.out.println(lampada.isAcesa());
        lampada.clickInterruptor();
        System.out.println(lampada.isAcesa());
        lampada.clickInterruptor();
        System.out.println(lampada.isAcesa());
        lampada.clickInterruptor();
        System.out.println(lampada.isAcesa());
        lampada.clickInterruptor();
        System.out.println(lampada.isAcesa());
        lampada.clickInterruptor();
        System.out.println(lampada.isAcesa());
        lampada.clickInterruptor();
        System.out.println(lampada.isAcesa());

        System.out.println("Atividade 1.3");
        Complexo complexo = new Complexo(2,3);
        Complexo complex2 = new Complexo(3,7);
        complexo.soma(complex2);
        System.out.println(complexo.toString());
        complexo.multiplica(complex2);
        System.out.println(complexo.toString());
        complexo.modulo(complex2);
        System.out.println(complexo.toString());
        System.out.println("Argumento: " + complexo.argumentoPrincipal(complex2));

        System.out.println("Atividade 1.4");
        Triangulo triangulo = new Triangulo(4);
        triangulo.calcPerimetro();
        System.out.println("Perímetro: " + triangulo.getPerimetro());
        triangulo.calArea();
        System.out.println("Areá: " + triangulo.getArea());

        System.out.println("Atividade 1.5");
        Advinha advinha = new Advinha();
        double numeroSorteado = advinha.sortear();
        System.out.println("Seu numero sorteado: "+ numeroSorteado );
        System.out.println(advinha.advinhacao(numeroSorteado));

        System.out.println("Atividade 1.6");
        Eq2Grau eq2Grau = new Eq2Grau(-10,2,1);
        System.out.println("Valor Delta:" + eq2Grau.delta());
        System.out.println("Primeira raiz: " + eq2Grau.raiz1());
        System.out.println("Segunda raiz: " + eq2Grau.raiz2());

        System.out.println("Atividade 1.7");
        Porta porta = new Porta();
        porta.abrir();
        System.out.println("A porta esta aberta: " + porta.isOpen());
        System.out.println("Quantas vezez a porta abriu: " + porta.getNumAberturas());
        porta.fechar();
        System.out.println("A porta esta aberta: " + porta.isOpen());
        System.out.println("Quantas vezez a porta abriu: " + porta.getNumAberturas());
        porta.abrir();
        System.out.println("A porta esta aberta: " + porta.isOpen());
        System.out.println("Quantas vezez a porta abriu: " + porta.getNumAberturas());

    }
}
