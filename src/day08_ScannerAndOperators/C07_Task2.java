package day08_ScannerAndOperators;

import java.util.Scanner;

public class C07_Task2 {
    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        Isminiz : Himmet
        //        Soyisminiz : Abi
        //        Yasiniz : 38
        //      Dogum Yeriniz: Kayseri
        //        Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasınızı gırınız");
        int yas = scanner.nextInt();

        System.out.println("Lutfen dogumyerınızı gırınız");
        scanner.nextLine();
        String dogumyeri = scanner.nextLine();


        System.out.println("İsminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Dogum yeriniz : " + dogumyeri);

        System.out.println("Kaydınız basarıyla tamamlanmıstır.");


    }
}
