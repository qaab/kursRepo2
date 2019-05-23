public class CompareOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Czy x jest większy od y?"); // wartości logiczne prawda lub fałsz
        System.out.println( x > y);

        System.out.println("Czy x jest różny od y?");
        System.out.println(x != y);

        System.out.println(x != y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);

        boolean instance = "Kasia" instanceof java.lang.String; // instanceof oznacza sprawdzenie czy  "Kasia" jest stringiem; java.lang.String to biklioteka obiektów typu string
        System.out.println(instance); // Kasia jest typu string


    }
}
