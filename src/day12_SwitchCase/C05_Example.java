package day12_SwitchCase;

import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {
        //ogencı ortalamasını alın
        //ortlama 50 altında ıse zayıf
        //50 dahıl ve 70 arası orta
        //70 dahil ve 85 arası iyi
        //85 ve uzerı alan ogrencıler pek iyi
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Ortalama Giriniz: ");
        double ort= scan.nextDouble();

        if(ort<50){
            System.out.println("Zayıf");
        } else if (ort<70) {
            System.out.println("Orta");
        } else if (ort<85) {
            System.out.println("İyi");
        }else{
            System.out.println("pek iyi");
            if (ort>=95){
                System.out.println("Basarı belgesı kazandınız");
            }
        }



    }


}
