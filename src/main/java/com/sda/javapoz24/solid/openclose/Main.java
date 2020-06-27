package com.sda.javapoz24.solid.openclose;

import com.sda.javapoz24.solid.openclose.strategies.StrategiaWalkiMieczem;
import com.sda.javapoz24.solid.openclose.strategies.StrategiaWalkiOwcą;

public class Main {
    public static void main(String[] args) {
        // STRATEGIA
        Bohater bohater = new Bohater("Marian");
        bohater.walcz();

        bohater.setStrategiaWalki(new StrategiaWalkiMieczem());
        bohater.walcz();
        bohater.walcz();

        bohater.setStrategiaWalki(new StrategiaWalkiOwcą());
        bohater.walcz();
    }
}
