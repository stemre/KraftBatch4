package day08_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //1.adım Scanner objesı olusturalım
        Scanner scan = new Scanner(System.in);


        //2.kullanıcı bılgılendır! Ne ıstedıgınızı soyleyın
        System.out.println("Lutfen ısmınızı gırınız");

        //3.girilen bilgiyi ıcıne koyabılecegınız varıable olusturun
        //olusturdugumuz degıskenın ıcerısıne scanner objesı ıle uygun methodu cagırarak cerıyı alın

        String name = scan.nextLine();
        System.out.println("Girilen isim : "+name);


        scan.close();





    }
}
