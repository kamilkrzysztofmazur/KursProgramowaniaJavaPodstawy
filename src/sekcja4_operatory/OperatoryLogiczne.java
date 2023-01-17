package sekcja4_operatory;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        // logical operators

        int wiek = 20;

        // koniunkcja (AND) "i"

        System.out.println(wiek >= 18 && wiek < 30);

        // alternaty (OR) "lub"

        System.out.println(wiek < 18 || wiek > 30);

        // negacja
        boolean prawda = true;
        System.out.println("!prawda: " + !prawda);
    }
}
