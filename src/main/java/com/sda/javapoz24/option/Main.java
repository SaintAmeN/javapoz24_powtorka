package com.sda.javapoz24.option;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<Integer> wartoscOpt = funkcjaMatematyczna(50, 0);
        if(wartoscOpt.isPresent()) {
            Integer wartosc = wartoscOpt.get();
            System.out.println("Wynik tego rozwiązania +10 = " + (wartosc + 10));
        }
    }

    /**
     * Optional - klasa sugerująca, że wynikiem metody może być wartość, ale nie musi (opcjonalnie, wartości może nie być).
     * @param a
     * @param b
     * @return
     */
    public static Optional<Integer> funkcjaMatematyczna(int a, int b) {
        if (b == 0) {
            // brak rozwiązania
            // 0 1 2 3
            return Optional.empty();
        }
        return Optional.of(a/b);
    }


}
