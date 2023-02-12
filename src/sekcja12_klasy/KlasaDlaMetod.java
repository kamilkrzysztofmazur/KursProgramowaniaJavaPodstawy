package sekcja12_klasy;

public class KlasaDlaMetod {
    // typZwracany nazwaMetody (parametry) {
    //  }

    void metodaKtoraNicNieZwraca () {
        System.out.println("Wartość wypisana z metody");
    }
    void metodaKtoraPrzyjmujeArgument(int liczba, char pojedynczyZnak) {
        liczba++;
        System.out.println("Wartość metody " + liczba + pojedynczyZnak);
    }

    void nazewnictwoDowolneAleKolejnaMetoda(boolean czyPokazac, int liczba) {
        if (czyPokazac) {
            System.out.println("Liczba: " + liczba);
        } else {
            System.out.println("Nie pozwolono pokazać!");
        }

    }
    int dodawanie(int a, int b) {
        int wynik = a+b;
        System.out.println("Dodawanie: " + wynik);
        return  wynik;
    }

    double dodajCosPoPrzecinku (double liczbaDouble) {
        double wynik = liczbaDouble + 0.55;
        return wynik;
    }

    int zwrocOdWartosciLogiczne(boolean czyZwrocic, int liczba) {
        if (czyZwrocic) {
            return liczba;
        } else {
            return 0;
        }
    }

    int przykladKolejnej() {
        System.out.println("Coś przed zwróceniem");
        return 100;
        //System.out.println("Wartość została zwrócona");
    }

    void voidKtoryMialbyCosZwracac(boolean czyZakonczyc) {
        if(czyZakonczyc){
            return;
        }
        System.out.println("Napis ponieważ false");
    }


}
