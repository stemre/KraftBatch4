package day12_SwitchCase;

import java.util.Scanner;

public class C03_Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi 1: ");
        double x = scan.nextDouble();

        System.out.println("Sayi 2 ");
        double y= scan.nextDouble();

        System.out.println("Lutfen ıslem secınız (+,-;*;/): ");
        String işlem= scan.next();

        if(işlem.equals("+")){
            System.out.println(x+y);
        } else if (işlem.equals("-")) {
            System.out.println(x-y);
        } else if (işlem.equals("*")) {
            System.out.println(x*y);
        } else if (işlem.equals("/")) {
            System.out.println(x/y);
        }


    }
}
