package day13_ForLoops;

import java.util.Scanner;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        // faktorıyel=gırılen sayıya kada olan sayıların carpımı
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi: ");
        int num= scan.nextInt();

        int faktoriyel=1;

        for ( int i=1 ;i<=num    ;i++  ){
            faktoriyel*=i;
        }
        System.out.println(num+"! = "+faktoriyel);
        }
    }

