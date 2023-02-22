package sekcja13_string;

public class StringRownyEquals {
    public static void main(String[] args) {
        String strLiteral1 = "tekst";
        String strLiteral2 = "tekst";

        boolean wynik = strLiteral1 == strLiteral2; // sprawdzeni czy referencje odnoszą sie do tego samegom miejsca
        System.out.println(wynik);

        String strObject1 = new String("tekst");
        String strObject2 = new String("tekst");
        wynik = strObject1 == strObject2;
        System.out.println(wynik);

        // equals() - sprawdzenie identycznosci dwóch str

        wynik = strLiteral1.equals(strObject2);
        System.out.println(wynik);

    }
}
