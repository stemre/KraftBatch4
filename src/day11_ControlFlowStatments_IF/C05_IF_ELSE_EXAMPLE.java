package day11_ControlFlowStatments_IF;

import java.util.Scanner;

public class C05_IF_ELSE_EXAMPLE {
    public static void main(String[] args) {
/*
        int havasıcaklıgı = 20;
        if (havasıcaklıgı >= 20) {
            System.out.println("hava sıcak");
        } else {
            System.out.println("hava soguk");
        }
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı gırınız: ");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0){
            System.out.println("bu bir cıft sayıdır");
        }else{
            System.out.println("bu bır tek sayıdır");
        }


    }
}
