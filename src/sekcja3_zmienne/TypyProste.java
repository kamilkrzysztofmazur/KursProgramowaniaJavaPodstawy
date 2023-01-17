package sekcja3_zmienne;
    public class TypyProste {
        public static void main(String[] args){
            // primitive types

            // Liczby całkowite
            byte zmiennaByte = 10;
            System.out.println(" Byte: " + zmiennaByte);
            System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

            short zmiennaShort = 200;
            System.out.println("Short :" + zmiennaShort);
            System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

            int zmiennInt = 1000000;                    //  nie można dwa razy utworzyć jednej zmiennej
            int d, e, f = 10, g, zmiennaIntDwa = 5;     // notacja jednolinijkowa niestosować
            System.out.println("Imt :" + zmiennInt);
            System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

            long zmiennLong = 100000000000L;
            System.out.println("Long :" + zmiennLong);
            System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

            // Liczby zmienno przecingowe

            float zmiennaFloat = 12.3432132321F;
            System.out.println(" Float: " + zmiennaFloat );
            System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);

            double zmiennaDouble = 10.34321321321;
            System.out.println(" Double: " + zmiennaDouble);
            System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);

            // Pojedyncze znaki
            char zmiennaChar = 'j';
            System.out.println("Char: " + zmiennaChar);

            // Wartości logiczne
            boolean zmiennaBoolen = true;
            System.out.println("Boolen: " + zmiennaBoolen);



        }
}
