public class Conversions {
    public static void main(String[] args) {
        double number1 = 10.985;
        int number2 = 5;

        // przykład konwersji zawężającej (eng: narrowing)
        int narrowing = (int) number1;

        // przykład konwesrsji rozszerzającej (eng: widening)
        double windening = (double) number2;

        System.out.println("Narrowing" + " "+narrowing);
        System.out.println("Windening" + " "+windening);

    }
}
