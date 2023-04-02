package day16_Branching_Statments;

import java.util.Scanner;

public class C01_BankaSorusu {
    public static void main(String[] args) {

        double money = 2000;
        Scanner scan = new Scanner(System.in);
        outerLoop:
        while (true) {
            System.out.println("1:para ekle 2:para çek 3:bakiye 4:çıkış");
            System.out.println("yapmak istediğiniz işlemi seçiniz: ");
            int tercih = scan.nextInt();
            switch (tercih) {
                case 1:
                    while (true) {
                        System.out.println("Eklemek istediğiniz tutarı girin: ");
                        double para = scan.nextDouble();
                        money += para;
                        System.out.println("bir üst menü için 1 basınız işleme devam etmek için 2");
                        int tercih2 = scan.nextInt();
                        if (tercih2 == 1) {
                            break;
                        } else if (tercih2 == 2) {
                           continue;
                        } else {
                            System.out.println("hatalı işlem yapıldıgı için kart iade ediliyor");
                            break outerLoop;
                        }
                    }
                    break;
            }
        }
    }
}
