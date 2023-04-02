package day07_Aritmetic_Operators;

import java.util.Scanner;

public class C02_Task2 {
    public static void main(String[] args) {
        // Örnek: Ali fizik dersinden 92, kimya dersinden 55, matematik dersinden 89
        // almıştır. Konsoldan bu değerleri kullanıcıya girdirerek ekrana Ali’nin not
        // ortalamasını yazdırın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Sınav notlarınızı giriniz: ");

        System.out.println("Fizik: ");
        int F = scan.nextInt();

        System.out.println("Kimya: ");
        int K = scan.nextInt();

        System.out.println("Matematik: ");
        int M = scan.nextInt();

        System.out.println("Not ortalamanız: ");
        double ort=(F+K+M)/3;
        System.out.println(ort);


    }
}
