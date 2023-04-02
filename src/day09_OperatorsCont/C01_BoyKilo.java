package day09_OperatorsCont;

import java.util.Scanner;

public class C01_BoyKilo {
    public static void main(String[] args) {
        // Kullanıcıdan boy(ondalıklı) ve kilosunu(ondalıklı) bilgisini alıp ekrana tek satırda yazdırnız

        Scanner scan = new Scanner(System.in);

        System.out.println("Boyunuzu Giriniz: ");
        double boy = scan.nextDouble();

        System.out.println("Kilonuzu Giriniz: ");
        double kilo = scan.nextDouble();

        scan.nextLine();
        System.out.println("Lutfen Ismınızı Gırınız: ");
        String isim = scan.nextLine();
        scan.nextLine();

        System.out.println("Lutfen Soyısmınızı Gırınız: ");
        String soyisim = scan.nextLine();
        scan.nextLine();

        System.out.println(isim + soyisim + " Boyunuz: " + boy + " Kilonuz: " + kilo);


    }

}
