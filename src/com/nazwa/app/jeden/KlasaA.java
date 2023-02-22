package com.nazwa.app.jeden;

public class KlasaA {
    public int polePubliczne;  // dostępny wszędzie
    protected int poleDziedziczenie; // dostępny w dzidziczeniu oraz tym samym pakege
    private int polePrywatne; // dostęþny w obrębie klasy
    int poleBezNiczego; // packege dostępy w tym samym packegu

    public void metodaPubliczna() {

    }
    protected  void  metodaProtected() {

    }
    private void metodaPrivate() {

    }
    void metodaBezNiczego() {

    }
}
