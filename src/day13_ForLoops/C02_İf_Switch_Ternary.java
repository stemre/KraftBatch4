package day13_ForLoops;

import java.util.Scanner;

public class C02_İf_Switch_Ternary {
    public static void main(String[] args) {

        ///* Kullanicidan bir harf isteyin
        //         o harfle baslayan gun ismi varsa yazdirin
        //         yoksa "gecersiz harf" yazdirin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);             //Scanner sinifi ile harf alamıyoruz,scan.next() String aldik
        //charAt(0) bu aldıgımız kelımenın ilk harfını almıs olduk

        if (harf == 'p' || harf == 'P') {
            System.out.println("Pazartesi,Pazar,Persembe");
        } else if (harf == 's' || harf == 'S') {
            System.out.println("Sali");
        } else if (harf == 'c' || harf == 'C') {
            System.out.println("carsamba,cuma,cumartesi");
        } else {
            System.out.println("Gecersiz harf");
        }

        System.out.println("------------------------------------------------");

        switch (harf) {
            case 's', 'S':
                System.out.println("Sali");
                break;
            case 'c':
            case 'C':
                System.out.println("Carsamba,Cuma,Cumartesi");
                break;
            case 'p', 'P':
                System.out.println("Persembe,Pazar,Pazartesi");
                break;
            default:
                System.out.println("Gecersiz harf");
        }

        System.out.println("------------------------------------------------");





























    }
}
