package day17_Methods;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        yaş();
    }
    //Bir method yazın doğum yılınızı girdiğinizde yaşınızı
    //versin
    public static void yaş(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz: ");
        int dogumyili=scan.nextInt();
        int yil=2023;
        System.out.println("Yaşınız: "+(yil-dogumyili));
    }
}
