package day10_Unarry_Logical_Operators;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("a sayısı ıcın bır tam sayı gırınız: ");
        int a= scan.nextInt();

        System.out.println("b sayısı ıcın bie tam sayi giriniz: ");
        int b= scan.nextInt();

       // int a=10;
       // int b=15;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        int temp=a;

        a=b;
        b=temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);




    }
}
