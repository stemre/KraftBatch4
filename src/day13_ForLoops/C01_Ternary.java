package day13_ForLoops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        ///*
        //         kullanicidan pozitif bir tamsayi alin
        //         sayi cift ise "sayi cift"
        //         degilse "tek sayi" yazdirin
        //         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif tam sayı girin: ");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("cift sayi");
        } else {
            System.out.println("Tek sayi");

        }
        System.out.println("----------------------------------------");

        System.out.println(sayi % 2 == 0 ? "Cift sati" : "Tek sayi");

        System.out.println("----------------------------------------");

        String result = (sayi % 2 == 0 ? "Cift sayi" : "Tek sayi");
        System.out.println(result);
        //(Condiation) ? (return if true) : (return if false);

    }
}