package com.sda.javapoz24.polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ptak p = new Kukulka();
        Ptak p2 = new Sowa();

        // wielopostaciowość - metoda może się różnie zachowywać
        //                      jej wykonanie jest uzależnione od referencji obiektu
        // wielopostaciowość obiektów/klas
        p.spiewaj(); // ku ku
        p2.spiewaj(); // hu hu

        metoda("tekst");            // 1
        metoda();                       // 2
        metoda("tekst", "tekst"); // 2

        // interfejs nadrzędny
        // zasada Pani Liskov
        // zasady SOLID?
        List<String> list = new ArrayList<>();
    }

    // metoda 1
    // precyzyjna definicja metody
    public static void metoda(String abc){

    }

    // metoda 2
    public static void metoda(String... abcd){ //

    }
}
