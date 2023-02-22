package sekcja13_string;

public class StringLiteralObject {
    public static void main(String[] args) {

        //    Literały:
        String str = "jakiś string";
        int i = 100;
        long l = 1321323L;
        char c = 'c';

        // przechowywany w pamięci w jednym miekscu bo taka sama nazwa
        String str1 = "jakiś string";
        String str2 = "jakiś sting";
        String str3 = "jakiś string";

        String inny = "inny";
        String inny2 = "inny";
        // flyweight - pyłek

        // Tworzenie za pomocą konstruktora inne miejsca w pamieci mimo tej samej wartości

        String przezKonstruktor = new String("przez konstruktor");
        String przezKonstruktor2 = new String("przez konstruktor");


    }
}
