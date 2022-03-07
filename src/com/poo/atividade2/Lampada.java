package com.poo.atividade2;

public class Lampada {
    boolean acesa;
    int click;

    public void clickInterruptor(){
        this.click +=1;
        this.acesa = !isAcesa();
    }
    public boolean isAcesa() {
        if(this.click > 5){
            return false;
        }
        return acesa;
    }

}
