package day17_Methods;

import java.util.Scanner;

public class C03_Methods_03 {
    public static void main(String[] args) {
        // aritmetikortlama();
        //buyuksayi();
        okka();
       // isimYaz("emre");
        ortalamaSayi(5,10,21);
    }

    public static void aritmetikortlama() {
        double x = 3, y = 5, z = 10;
        double result = (x + y + z) / 3;
        System.out.println("ortalama: " + result);
    }

    public static void buyuksayi() {
        int x = 0, y = 20;
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        System.out.println("En buyuk sayi: " + max);

    }


    public static void okka() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kilogram: ");
        double kilo= scan.nextDouble();
        double okka=(kilo/1.282);
        System.out.println(kilo+" kilogram "+okka+" okkadır ");
    }
    public static void isimYaz(String name){
        System.out.println("İsminiz: "+name+"dır");
    }
    public static void ortalamaSayi(int x,int y,int z){
        double ortalama=((double) x+y+z)/3;
        System.out.println(ortalama);

    }
}
