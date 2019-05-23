import java.util.Scanner;

public class classGuessGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //

        final int number = 500;                                                            // oznacza zgadywaną liczbę
        int userInput;                                                                     //niżej komuikat w konsoli
        System.out.println("Zgadnij liczbę");

        while ((userInput = reader.nextInt()) !=number) {                                  // pętla while: dopóki nie zostanie wprowadzona
            // prawidłowa liczba - podana w final incie
            if (userInput > number) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
            } else {
                System.out.println("Podana liczba jest za mała, zgaduj dalej!");
            }
        }

        System.out.println("Brawo, zgadłeś o jaką liczbę chodziło, wygrałeś złote kalesony!!");

        reader.close();
    }
}
