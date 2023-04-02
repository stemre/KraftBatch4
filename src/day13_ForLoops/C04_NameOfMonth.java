package day13_ForLoops;

import java.util.Scanner;

public class C04_NameOfMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between [1-12]: ");
        int n = scan.nextInt();
        String result = "";

        if (n >= 1 && n <= 12) {
            if (n == 1) {
                result = "Ocak";
            } else if (n == 2) {
                result = "Şubat";
            } else if (n == 3) {
                result = "Mart";
            } else if (n == 4) {
                result = "Nisan";
            } else if (n == 5) {
                result = "Mayıs";
            } else if (n == 6) {
                result = "Haziran";
            } else if (n == 7) {
                result = "Temmuz";
            } else if (n == 8) {
                result = "Ağustos";
            } else if (n == 9) {
                result = "Eylül";
            } else if (n == 10) {
                result = "Ekim";
            } else if (n == 11) {
                result = "Kasım";
            } else if (n == 12) {
                result = "Aralık";
            } else {
                result = "Invalid Number";

            }
            System.out.println(result);
        }
        System.out.println("--------------------------------------------------");

        String nameOfMonth = (n >= 1 && n <= 12) ? (n == 1) ? "Ocak":(n == 2) ?"subat":(n == 3)?"mart" :(n==4)?"nisan":
                (n==5)?"Mayıs":(n==6)?"Haziran":(n==7)?"Temmuz":(n==8)?"Agustos":(n==9)?"eylul":(n==10)?"ekim":
                        (n==11)?"kasım":"aralık":"Gecersiz sayi";
        System.out.println(nameOfMonth);



    }
}
