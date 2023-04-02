package day08_ScannerAndOperators;

public class C03_AritmeticOperators {
    public static void main(String[] args) {


        System.out.println("90" + 10);
        System.out.println(10 + "20");
        System.out.println("90" + 10 + 10);
        System.out.println("90" + (10 + 10));
        System.out.println(10 + "90" + 30);
        System.out.println(10 + 30 + "90");
        System.out.println("" + 10 + 30 + "90");
        System.out.println("------------------------------");

        System.out.println(10 + 20);
        System.out.println(100 - 20);
        System.out.println(10 + 6);
        System.out.println("------------------------------");

        System.out.println(100 / 3);
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        System.out.println("------------------------------");

        int a = 100;
        double b = a / 6;
        double c = 16;
        System.out.println(b);
        System.out.println(c);
        double d = (double) a / 6;
        System.out.println(d);
        System.out.println(100);
        System.out.println(100d);
        System.out.println("------------------------------");
        System.out.println(10%2);
        System.out.println(10%3);
        System.out.println(10%4);
    }
}
