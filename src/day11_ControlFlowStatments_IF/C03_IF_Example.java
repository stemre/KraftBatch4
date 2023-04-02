package day11_ControlFlowStatments_IF;

import java.util.Scanner;

public class C03_IF_Example {
    public static void main(String[] args) {
/*
        int fizik = 50;
        int kimya = 55;
        if ((fizik + kimya) / 2 > 50) {
            System.out.println("Ali geçti");
       }
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("ders notlarını giriniz");
        System.out.println("Fizik: ");
        double f = scan.nextDouble();
        System.out.println("kimya: ");
        double k = scan.nextDouble();
        System.out.println("Geçme notu");
        double gecmeNotu = scan.nextDouble();

        double ort = (f + k) / 2;
        if (ort > gecmeNotu) {
            System.out.println("Sınıfı Gectınız tebrıkler");
        }
        {
            System.out.println("Harika");
            System.out.println("Bir üst Sınıf");
        }
        System.out.println("A");
        System.out.println("B");
    }
}
