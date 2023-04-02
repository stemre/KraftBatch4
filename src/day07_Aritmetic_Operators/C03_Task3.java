package day07_Aritmetic_Operators;

import java.util.Scanner;

public class C03_Task3 {
    public static void main(String[] args) {
//Yarıçapı kullanıcıdan alarak dairenin alanı ve çevresini
//hesaplayın?
//(PI=3.14)
        Scanner scan = new Scanner(System.in);
        System.out.println("Yarı capı girin: ");
        double yc = scan.nextDouble();

        double yc1=yc*yc;
        double pi = 3.14;
        double da =pi*yc1;
        System.out.print("Dairenin Alanı: ");
        System.out.println(da);

        double ca=2*3.14*yc;
        System.out.print("Dairenin Cevresi: ");
        System.out.println(ca);







    }
}
