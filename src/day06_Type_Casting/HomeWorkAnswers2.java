package day06_Type_Casting;

public class HomeWorkAnswers2 {
    public static void main(String[] args) {
        //Ali sınıfta 7-7 halı saha maçı planlamak ve
        // oynanan maçta hakem olmak istiyor
        // sınıfta 18 kişi var ise kaç kişi oyun dışı kalacaktır.

        int toplamoyuncu=18;
        int hakem=1;
        int oynayacakoyuncu =14;

        int kalan=toplamoyuncu-hakem-oynayacakoyuncu;
        System.out.println(kalan);


    }
}
