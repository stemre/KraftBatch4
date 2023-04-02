package day19_CustomMethods_Return;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        int sonuc=faktoriyelHesapla(4);
        System.out.println("sonuc = " + sonuc);
    }


    /* Method olusturma asamaları
    1.public static (standart)
    2.olusturacagımız metod bıze bır sonuc dondurecekse data tıpını belırtmek gerekıyor
    3.metod adi
    4.metodun parantezi() parametre olup olmayacagı ve parametre data tıpleri ve ısımleri parantez içerisine yazilir
    5.{}bodu aç , dondurulmesı ıslemı yap
    6.return keyword ile dondurulmesı planlanan degerı dondur
     */

    //verdiğimiz bir sayının faktorıyelını hesaplayıp
    //sonucu bıze donduren bır method olusturun

    public static int faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }


}
