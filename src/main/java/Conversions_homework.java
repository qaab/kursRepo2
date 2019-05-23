class Conversions_homework {
    public static void main(String[] args) {
        int x = 4;
        int y = 7;

        // System.out.println(x > y);
        System.out.println("x=" + x + ",y=" + y);

        // czy x jest większe od y
        boolean result = x > y;
        System.out.println("x>y= " + result);

        //Czy x pomnożone przez 2 jest większe od y
        //System.out.println(2*x < y);
        result = x * 2 > y;
        System.out.println("2*x > y" + " " + result);
        //system.out.println("x=" + x ",y=" + y);

        //Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2
        result = ((x+3) > y) && (y > (x-2));
        System.out.println("(x+3) > y) && (y > (x-2) =" + result);

        // Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
        result = (x * y)%2 == 0;


    }


}
