package day15_If_Else___Switch_Loops_Summary;

public class C07_Example {
    public static void main(String[] args) {
        //soru 1den 100e kadar olan cıft sayıları yazın

        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        int i=1;
        while(i<=100){
        if(i<=100){
            System.out.print(i+" ");
        }
        i++;
        }

        int j=2;
        while (j<=100){
            System.out.print(j+" ");
            j+=2;
        }
        System.out.println();
        int k=2;
        do{
            System.out.print(k+" ");
            k+=2;
        }while (k<=100);
    }
}
