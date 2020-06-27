package com.sda.javapoz24.solid.openclose;

public class Bohater {
    private String imie;
    private IStrategiaWalki strategiaWalki;

    public Bohater(String imie) {
        this.imie = imie;
    }

    public void setStrategiaWalki(IStrategiaWalki strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }

    public void walcz(){
        if(strategiaWalki == null){
            System.out.println("Jestem bezbronny!");
        }else {
            strategiaWalki.walcz();
        }
    }
}
