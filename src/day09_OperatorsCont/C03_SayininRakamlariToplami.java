package day09_OperatorsCont;

import java.util.Scanner;

public class C03_SayininRakamlariToplami {
    public static void main(String[] args) {
        //Kullanıcıdan 3 basamaklı bir sayı alın ve sayının rakamları toplamını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı bır sayı gırınız: ");

        int number = scan.nextInt();
        int lastDigit = number % 10;

        int totalofdigits = lastDigit;

        number = number / 10;
        lastDigit = number % 10;
        totalofdigits = totalofdigits + lastDigit;

        number = number / 10;
        lastDigit=number%10;
        totalofdigits=totalofdigits+lastDigit;

        System.out.println("Rakamlar toplamı: "+totalofdigits);


    }
}
