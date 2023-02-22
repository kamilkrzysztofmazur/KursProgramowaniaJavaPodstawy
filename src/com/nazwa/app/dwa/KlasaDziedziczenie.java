package com.nazwa.app.dwa;

import com.nazwa.app.jeden.KlasaA;

public class KlasaDziedziczenie {
    public class KlasaDziedziczenie extends KlasaA {
        public void metoda() {
            polePubliczne = 101;     // odwołanie do pola private
            poleDziedziczenie = 102;  // odwołanie do pola dziedziczenie
            metodaPubliczna();
            metodaProtected();
        }
    }
}
