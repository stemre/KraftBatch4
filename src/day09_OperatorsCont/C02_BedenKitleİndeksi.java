package day09_OperatorsCont;

import java.util.Scanner;

public class C02_BedenKitleİndeksi {
    public static void main(String[] args) {
        //Kullanıcıdan aldıgınız boy ve kılo degerlerıne gore kullanıcının beden kıtle ındeksını bulun
        // beden kıtle ındeksı: kılo/ (boy(m) * boy(m))

        Scanner scan = new Scanner(System.in);


        System.out.println("Kilonuzu Giriniz: ");
        int kilo = scan.nextInt();


        System.out.println("Boyunuzu Giriniz: ");

        double boy=scan.nextDouble();

          double BKİ=kilo/(boy*boy);

            System.out.println("Kilonuz: "+kilo);

        System.out.println("Boyunuz: "+boy);

           System.out.println("Beden Kitle İndeksiniz: "+BKİ);

    }

}
