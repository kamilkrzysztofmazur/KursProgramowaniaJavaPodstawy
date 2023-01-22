package sekcja10_petle;

public class PetlaBreakContinue {
    public static void main(String[] args) {
        // loop break continue

        int zmienna;

        for (zmienna = 1; zmienna <= 20; zmienna++){
            if (zmienna == 18) {
                continue;           // w tym miejscu przerywa i zaczyna kolejną iterację
            }
            System.out.println("zmienna: " + zmienna);

        }

        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna == 18) {
                break;              // w tym miejscu przerywa dzialanie pętli for
            }
            System.out.println("Zmienna drugiej pętli: " + zmienna);
        }

        for (zmienna = 1;;zmienna++) {                                  // brak drugiego argumentu oznacza "true"
            System.out.println("Trzeci for: " + zmienna ); // zrobienie z for pętli while
            if (zmienna == 100) {
                break;
            }

        }



    }
}
