package day19_CustomMethods_Return;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        //Kullnıcıdan 10'dan kucuk ıkı pozıtıf tamsayı alıp
        //faktorıyel degerlerını toplayın

        Scanner scan=new Scanner(System.in);
        System.out.println("10'dan kucuk 2 adet pozıtıf tam sayı gırınız");
        int i1= scan.nextInt();
        int i2= scan.nextInt();
        int sonuc = C03_Faktoriyel.faktoriyelHesapla(i1)+C03_Faktoriyel.faktoriyelHesapla(i2);
        System.out.println("sonuc = " + sonuc);
    }

}
