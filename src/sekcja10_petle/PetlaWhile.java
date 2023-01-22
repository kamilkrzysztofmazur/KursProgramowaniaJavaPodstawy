package sekcja10_petle;

public class PetlaWhile {
    public static void main(String[] args) {
        // loop while

        int liczenie = 99;
        while (liczenie <= 10) {
            System.out.println("Tekst " + liczenie);
            liczenie++;
        }

        // loop do while
        liczenie = 99;
        do {
            System.out.println("Tekst z doWhile: " + liczenie);
            liczenie++;
        } while(liczenie <= 10);

    }
}
