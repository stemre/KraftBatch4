package day06_Type_Casting;

public class HomeWorkAnswers3 {
    public static void main(String[] args) {
        //Ali oynanan maçta 1 hakem olacak şekilde
        // okulda  7-7 halı saha maçıları planlamak istiyor
        // okul mevcudu 188 ise kaç kişi dışarıda kalır.
        int ToplamOyuncu = 188;
        int hakem = 1;
        int oyuncusayisi = 14;

        int kalan=ToplamOyuncu%(oyuncusayisi+hakem);
        System.out.println(kalan);
    }
}
