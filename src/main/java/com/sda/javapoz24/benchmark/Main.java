package com.sda.javapoz24.benchmark;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            integers.add(i);
        }

//        for (int i = 0; i < 5; i++) {
        Long czasStart = System.currentTimeMillis();
        List<Integer> lista = metodaStream(integers, 100);
        Long czasStop = System.currentTimeMillis();

        System.out.println("Rozmiar po : " + lista.size());
        System.out.println("Wynik: " + (czasStop - czasStart));
//        }

    }

    public static List<Integer> metodaStream(List<Integer> integers, final int liczbaUsuwana) {
        return integers.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer != liczbaUsuwana;
                    }
                })
                .collect(Collectors.toList());
    }

    public static List<Integer> metodaPetla(List<Integer> integers, int liczbaUsuwana) {
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == liczbaUsuwana) {         //
                integers.remove(i);
                i--;
            }
        }
        return integers;
    }
}
