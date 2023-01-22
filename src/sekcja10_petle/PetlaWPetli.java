package sekcja10_petle;

public class PetlaWPetli {
    public static void main(String[] args) {
        int licznik = 0;
        int tab[][] = new int[5][10];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++) {
                licznik++;
                tab[i][j] = licznik;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }


    }
}
