package com.sda.javapoz24.hash;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        HashMap/ HashSet
        // hashcode

        Set<Para> paras = new HashSet<>();
        paras.add(new Para(2, 1));
        paras.add(new Para(2, 2));
        paras.add(new Para(1, 1));

        paras.add(new Para(1, 2));
        paras.add(new Para(1, 2));

        System.out.println("Rozmiar: " + paras.size()); //?
        for (Para para : paras) {
            System.out.println(para);
        }



    }
}
