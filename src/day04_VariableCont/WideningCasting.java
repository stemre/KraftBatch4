package day04_VariableCont;

public class WideningCasting {
    public static void main(String[] args) {

        int sayi = 9;
        double kur = 18.9;
        kur = sayi;
        System.out.println(kur);  // int tipindeki 9 degerını double ıcıne attım java
        //  otomatık olarak onu 9.0 olarak yazdı


        double num1 = 5;
        System.out.println(num1);

    }
}


//byte-short-int-long-float-double