package day13_ForLoops;

public class C11_Task3 {
    public static void main(String[] args) {
        //Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları
        //ekrana yazdırın.

        for (int i = 10; i <= 1000; i++) {

            if(i%10==0){
                System.out.print(i+" ");
            }

        }
    }
}
