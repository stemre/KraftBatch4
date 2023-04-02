package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C07_ParolayıTahminEt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String parola = "safak";
        String tahmin = "";
        int hak = 3;
        System.out.println("Parolayı tahmın edınız toplam 3 hakkınız var.");

        while (0<hak){
            tahmin= scan.nextLine();
            if(tahmin.equals(parola)){
                System.out.println("Tebrikler.Parolayı bildiniz");
                break;
            }else{
                System.out.println("Parolayı yanlıs bıldınız kalan hakkınız: " + (--hak));
            }


        }


    }
}
