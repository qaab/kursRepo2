public class LogicalOperators { //to powinienem jeszcze raz przejrzeć, choćby przy okazji innego zadania
    public static void main(String[] args) {
        int z = 5;
        int d = 10;
        boolean logic = true;

        System.out.print("z < 10 && d < 11");
        System.out.println(z < 10 && d < 11);
        System.out.print("z < 10 && d < 10");
        System.out.println(z < 10 && d < 10);
        System.out.print("z < 11 || d < 11");
        System.out.println("z < 11 || d < 11");

        System.out.print(logic);
        System.out.print(", !logic =");
        System.out.println(", !logic" );

        System.out.println("Warunek złożony !(z < 10 && d < 10"); // false
        System.out.println(!(z < 10 && d < 10));

    }
}