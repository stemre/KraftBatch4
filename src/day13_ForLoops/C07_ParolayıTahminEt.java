package day13_ForLoops;
import java.util.Scanner;
public class C07_ParolayıTahminEt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String parola="safak";
        String tahmin="";
        int hak=3;

        System.out.println("Parolayı tahmın edınız(toplam 3 hakkınız var) : ");

        for (int i=1;i<=3;i++){
            tahmin=scan.nextLine();
            if (tahmin.equals(parola)){
                System.out.println("Tebrıkler parolayı dogru bıldınız");
                break;
            }else{
                System.out.println("Parola yanlıs Kalan tahmın hakkınız : "+(hak-i));
            }
        }

        }




    }

