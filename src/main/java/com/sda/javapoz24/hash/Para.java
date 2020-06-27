package com.sda.javapoz24.hash;

import com.sda.javapoz24.hash.packageExample.TestowaModyfikatory;

import java.util.Objects;

public class Para extends TestowaModyfikatory {
    private int a;
    private int b;

    public Para(int a, int b) {
        this.a = a;
        this.b = b;
        this.pProtected = 5; // ponieważ dziedziczymy (poza packagem)
    }

    // po nadpisaniu metod, metoda equals przestaje porównywać obiekty na podstawie = adresów w pamięci
    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;     // porównanie adresów/referencji
        if (o == null || getClass() != o.getClass()) return false;      // obiekty różnią się klasą
        Para para = (Para) o;
        return a == para.a &&
                b == para.b;
    }

    // jeśli nie nadpiszemy metody, to domyślnie generuje hashcode z adresu w pamięci
    // jeśli nadpiszemy tą metodę, to kod generowany jest na podstawie wartości pól.
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Para{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
