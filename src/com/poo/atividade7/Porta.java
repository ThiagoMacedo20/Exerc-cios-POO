package com.poo.atividade7;

public class Porta {


    private boolean open;
    private int numAberturas;

    public void abrir(){
        this.numAberturas +=1;
        this.open = true;
    }
    public void fechar(){
        this.open = false;
    }
    public boolean isOpen(){
        return open;
    }
    public int getNumAberturas() {
        return numAberturas;
    }


}
