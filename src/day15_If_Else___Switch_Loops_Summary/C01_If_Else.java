package day15_If_Else___Switch_Loops_Summary;

public class C01_If_Else {
    public static void main(String[] args) {

        //Kullanıcının girdigi sayı cıftmı tekmı ?

        int x=5;
        if(x%2==0){
            System.out.println("çift");
        }else{
            System.out.println("tek");
        }
        //Bir sayının pozıtıf/negatıf veya 0a esıtse ekrana yazsın ?

        int y=5;
        if(y>0){
            System.out.println("pozitif");
        } else if (y<0) {
            System.out.println("negatif");
        }else{
            System.out.println("sıfır");
        }

        if(false){
            System.out.println("A");
        } else if (false) {
            System.out.println("B");
        } else if (false) {
            System.out.println("C");
        } else if (false) {
            System.out.println("D");
        } else if (false) {
            System.out.println("E");
        }else{
            System.out.println("F");
        }


    }
}
