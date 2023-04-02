package day15_If_Else___Switch_Loops_Summary;

import java.util.Scanner;

public class C04_Switch_Case_Example {
    public static void main(String[] args) {
        //byte,short,int,char,String
/*
        int x = 2;

        switch (x) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");

        }

   */

        // et menü, cocuk menü, sebze menü (1-2-3)
        //et menu pirzola 50tl,tavuk 30tl
        //sebze menu engınar 30tl,roka salatası 40tl
        //cocuk menu patates kızartması 10,makarana 5tl


        Scanner scan = new Scanner(System.in);
        System.out.println("et menü,sebze menü,cocuk menü (1-2-3)");
        int tercih_1 = scan.nextInt();
        switch (tercih_1) {

            case 1:


                System.out.println("pirzola mı(1) tavuk mu(2)");
                int tercih_2 = scan.nextInt();
                switch (tercih_2) {
                    case 1:
                        System.out.println("pirzola 50 tl");
                    case 2:
                        System.out.println("tavuk 30tl");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;

            case 2:
                System.out.println("enginar (1) roka salatası (2): ");
                int tercih_3 = scan.nextInt();
                switch (tercih_3) {
                    case 1:
                        System.out.println("enginar 30tl");
                        break;
                    case 2:
                        System.out.println("roka salatası 40tl");
                        break;

                    default:
                        System.out.println("hatalı giriş");
                }
                break;

            case 3:
                System.out.println("patates kızartması (1) makarna (2: )");
                int tercih_4 = scan.nextInt();
                switch (tercih_4) {
                    case 1:
                        System.out.println("patates kızartması 10tl");
                        break;
                    case 2:
                        System.out.println("makarna 5tl");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                        break;
                }


        }
    }
}
