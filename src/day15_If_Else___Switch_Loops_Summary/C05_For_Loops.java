package day15_If_Else___Switch_Loops_Summary;

import java.util.Scanner;

public class C05_For_Loops {
    public static void main(String[] args) {
/*
        boolean a= false;
        boolean b=true;

        for(int i=0;i<3;i++){
            System.out.println(i);
        }

        while(a){

            if(4<5){
                a=false;
            }

        }
*/
        //Kullanıcının 3hakkı olsun sıfre gırsın
        Scanner scan=new Scanner(System.in);
        int sifre=56;

        System.out.println("Sifreyi Giriniz 3 hakkınız var");
        boolean result=true;
        int i=0;
        while (result){
            System.out.println("Sifre: ");
        int tahmin= scan.nextInt();
        if(sifre==tahmin){
            System.out.println("sifre dogru");
            break;
        }else{
            System.out.println("sifre yanlış");
        }
        }



    }
}
