public class ShorthandOperators {
    public static void main(String[] args) {
        int x = 10;
        x += 5;

        System.out.println(x); // wartość oczekiwana 15

        x *= 3;
        System.out.println(x); // pod uwagę bierze tego wartość ostatniego iksa

        x /= 5; // wynik oczekiwany 9 - poprzedni x ma zostać podzielony przez 5 ( ostani oznacza wynik otrzymany w poprzednim działaniu
        System.out.println(x);

        x -= 2;// wynik oczekiwany to: 7
        System.out.println(x);

        x %= 4; // i to muszę powtórzyć, bo nie jestem pewien jak to działa
        System.out.println(x);


       }
}
