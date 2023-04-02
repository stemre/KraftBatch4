package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C02_MaximumNumber {
    public static void main(String[] args) {
        ////Kullanıcıdan 5 sayı ısteyın maksimum olanı konsola yazsın
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Lutfen bir sayı giriniz: ");
            int num = scan.nextInt();
            if (num>max){
                max=num;
            }

        }
        System.out.println("En buyuk sayı = "+max);
    }
}
