package day12_SwitchCase;

import java.util.Scanner;

public class C07_Swit_Case_Example {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        /*     System.out.println("Sayi 1: ");
        double x = scan.nextDouble();

        System.out.println("Sayi 2 ");
        double y = scan.nextDouble();


        System.out.println("Lutfen ıslem gırınız: ");
        String işlem = scan.next();

        switch (işlem) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":

                System.out.println(x - y);
                break;
            case "*":

                System.out.println(x * y);
                break;
            case "/":

                System.out.println(x / y);
                break;
*/

        int weekday = 8;
        switch (weekday) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("hatalı gırıs 1 ile 7 dahıl arasında bır gun gırınız");


        }

        int beden = 50;
        switch (beden) {
            case 38, 40, 42:
                System.out.println("small");
                break;
            case 44, 46, 48:
                System.out.println("medium");
                break;
            case 50,52,54:
                System.out.println("large");
                break;
            default:
                System.out.println("beden elimizde yoktur");

        }


    }


}

