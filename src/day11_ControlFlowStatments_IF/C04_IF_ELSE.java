package day11_ControlFlowStatments_IF;

import java.util.Scanner;

public class C04_IF_ELSE {
    public static void main(String[] args) {
       /*
       double f=60;
        double k=55;
        double ort=(f+k)/2;
        double gecmeNotu=50;
        if(ort> gecmeNotu){
            System.out.println("Ali gecti");
        }else {
            System.out.println("Ali kaldı");
        }
*/
        //fizi kimya ve matematık notlarını konsoldan alsın
        //80 uzerınde ıse gectı yazsın
        //80 ve akrında ıse kaldı yazsın
        Scanner scan = new Scanner(System.in);

        System.out.println("Ders notlarını gırınız");

        System.out.println("Matematik");
        double m = scan.nextDouble();
        System.out.println("Fizik");
        double f = scan.nextDouble();
        System.out.println("Kimya");
        double k = scan.nextDouble();
        System.out.println("Gecme Notu");
        double gecmeNotu = scan.nextDouble();

        double ort = (m + f + k) / 2;
        if (ort <= gecmeNotu) {
            System.out.println("sınıfı gectınız");
        } else {
            System.out.println("kaldınız");
        }


    }
}