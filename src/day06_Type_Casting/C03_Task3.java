package day06_Type_Casting;

public class C03_Task3 {
    public static void main(String[] args) {
//Ali fizik dersinden 92, kimya dersinden 55, matematik
//dersinden 89 almıştır.
//1.Ali’nin not ortalaması kaçtır?
//2. Ortalama sınıf geçme notu 80 üzeri olduğuna göre Ali’nin sınıfı
//geçti ise ekrana true geçmedi ise false yazdırın.
//(ipucu: boolean sonuc= ortalama>80)

        int f=92;
        int k=70;
        int m=89;
        double ort=(f+k+m)/3;
        System.out.println("Ortalamanız: "+ort);

        boolean ort1=ort>80;



        System.out.println("Sınıfı gectınız: "+ort1);





    }
}
