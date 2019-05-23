import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // zamiast "scan" najlepeiej użyć input

        System.out.println("Wprowadź swoje imię: ");
        String firstName = scan.nextLine();
        System.out.println("Wprowadź swoje nazwisko: ");
        String lastName = scan.nextLine();
        System.out.println("Podaj swój wiek: ");
        int age = scan.nextInt();

        scan.close();
        System.out.println("Cześć " + firstName +" "+ lastName);
        System.out.println("Masz już "+ age + " lat, " + " " + "starość nie radość!:)");

    }
}
