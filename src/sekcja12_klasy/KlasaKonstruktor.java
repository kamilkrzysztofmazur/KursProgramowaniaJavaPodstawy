package sekcja12_klasy;

public class KlasaKonstruktor {

    int pierwszePole;
    int drugiePole;

    KlasaKonstruktor() {

    }

    KlasaKonstruktor(int wartoscPierwsza) {
        pierwszePole = wartoscPierwsza;
        drugiePole = 1000;
    }


    KlasaKonstruktor(int wartoscPierwsza, int wartoscDruga) {           // Konstruktor
        pierwszePole = wartoscPierwsza;
        drugiePole = wartoscDruga;
    }



}
