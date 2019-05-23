public class Concat { // konkatenacja łańcuchowe sprzęganie wersów - łączenie  w większe wyrażenia - łączenie dwóch wyrażeń
    public static void main(String[] args) {
        String s1 = "Dupa";
        String s2 = "powinna być";
        String s3 = "zgrabna";
        String s4 = s1 + " " + s2 + " " + s3;

        System.out.println(s4);

        // niżej przykład bezpośredniej konkatencji w stringu

        System.out.println("Uczę się javy od"+" " + 6 + " "+"godzin");

        // można łączyć inne typy zmiennych (boolean)

        System.out.println("Kasia is beautiful. It is" + " " +true);





    }
}
