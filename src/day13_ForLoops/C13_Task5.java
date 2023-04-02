package day13_ForLoops;

public class C13_Task5 {
    public static void main(String[] args) {
     //Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
        //değerlerini ekrana yazdırın. (C=(F-32) / 1.8)

        for( int i=23  ;i<=50   ;i++   ){
           double f=i*1.8+32;
            System.out.println("C "+i+" = "+f+" F");

            }

        }
   }

