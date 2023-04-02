package day17_Methods;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        okka();
    }
    //kgTASKS
    //Bir method yazın ve kiloyu okka cinsinden versin. okka=1.282kg
    public static void okka(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kilo Giriniz: ");
        double kilo=scan.nextDouble();
        double okka=(kilo/1.282);
        System.out.println("Girdiğiniz Kilo: "+kilo);
        System.out.println("Okka: "+okka);




    }
}
