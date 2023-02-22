package com.nazwa.app.jeden;

public class KlasaBezNiczego {
    public void metoda() {
        KlasaA obiekt = new KlasaA();
        obiekt.polePubliczne = 202;
        obiekt.poleBezNiczego = 203;
        obiekt.poleDziedziczenie = 204;
        obiekt.metodaPubliczna();
        obiekt.poleBezNiczego();
        obiekt.metodaProtected();
    }
}
