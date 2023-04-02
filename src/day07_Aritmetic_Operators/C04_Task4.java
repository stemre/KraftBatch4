package day07_Aritmetic_Operators;

import java.util.Scanner;

public class C04_Task4 {
    public static void main(String[] args) {
        //Ödev 2: Kullanıcıdan Fahrenheit değerini alarak Celsius değerini
        //ekrana yazdırın? (°C=(°F-32)/1.8)
        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheiıt degerını giriniz: ");
        double fah=scan.nextDouble();

        double cel=((fah-32)/1.8);
        System.out.println("Celsius Degeri: "+cel);




    }
}
