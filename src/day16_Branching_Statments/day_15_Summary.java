package day16_Branching_Statments;

public class day_15_Summary {
    public static void main(String[] args) {
        //><
         int taban=2;
         int kuvvet=0;

         int result=1;
        for(int i=0;i<kuvvet;i++) {
            result *= taban;
        }
        if(taban==0&&kuvvet==0){
            System.out.println("tanımsız");
        }else{
            System.out.println(result);
        }







    }
}
