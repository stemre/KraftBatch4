package day12_SwitchCase;

import java.util.Scanner;

public class C04_Nested_ıf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınız: ");
        int yaş = scanner.nextInt();

        if (yaş >= 18) {
            System.out.println("Yanınızda bayan var mı Evet/Hayır");
            String yanit = scanner.next();
            if (yanit.equals("Evet")) {
                System.out.println("Yuzme bılıormusunuz Evet/Hayır: ");
                String yanit2 = scanner.next();
                if (yanit2.equals("Evet")) {
                    System.out.println("Hoş Geldiniz");
                } else {
                    System.out.println("Yuzme bılmeyenler gırıs yapamaz");
                }
            } else {
                System.out.println("Giremezsiniz");
            }


        }

    }
}