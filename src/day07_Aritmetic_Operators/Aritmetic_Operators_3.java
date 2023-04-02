package day07_Aritmetic_Operators;

public class Aritmetic_Operators_3 {
    public static void main(String[] args) {

        //31502 saniye kaç saat kaç dakika kaç saniyedir? (1 saat 60 dakika 1 dakika 60 sn)


        int toplamsaniye = 31502;
        int saat = toplamsaniye / 3600;
        int dakika = toplamsaniye%3600/60;
        int saniye=toplamsaniye%60;
        System.out.println(saat+" saat "+dakika+" dakika "+saniye+" saniye");

    }
}
