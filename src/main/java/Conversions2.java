public class Conversions2 {
    public static void main(String[] args) {
        char letter1 = 'k';
        char letter2 = 'o';
        char letter3 = 't';

        System.out.println("Błędne sumowanie znaków");
        System.out.println(letter1 + letter2 + letter3);
        System.out.println("Tekst jawny");
        System.out.println("" +letter1 + letter2 + letter3); // "" na początku umieszczony jest tam w celu wyłączenia sumowania kodów znaków i wpowadzenia konkatencji
        letter1++;
        letter2++;
        letter3++;
        System.out.println("Tekst zaszyfrowany");
        System.out.println("" +letter1 + letter2 + letter3);


    }
}