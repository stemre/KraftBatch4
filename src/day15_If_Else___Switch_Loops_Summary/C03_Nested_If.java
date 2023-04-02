package day15_If_Else___Switch_Loops_Summary;

public class C03_Nested_If {
    public static void main(String[] args) {

        //Alinin cebinde 100tl var ise ve zamanı var ise sinemaya gitsin
        //100tlsi yok ise evde kalsın
/*

        int alipara = 120;
        boolean zaman = false;

        if (alipara >= 100) {

        if (zaman) {
            System.out.println("Sinemaya gidebilir");
        } else {
            System.out.println("parası var ama zamanı yok gıdemez");
        }

    }else{
        System.out.println("parası yok gidemez");

        }
     */
        int alipara=120;
        boolean zaman=false;

        if(alipara>= 100&&zaman){
            System.out.println("sinemaya gidebilir");
        }else{
            System.out.println("sinemaya gidemez");
        }


     }
    }