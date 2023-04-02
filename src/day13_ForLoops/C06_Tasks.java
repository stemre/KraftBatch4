package day13_ForLoops;

public class C06_Tasks {
    public static void main(String[] args) {
        //Bir program yazın ve 0-100 arasındakı tum sayıları yazsın

        for (int i = 1; i <= 100; ++i) {

            System.out.print(i + "  ");

        }

        System.out.println();
        System.out.println("-------------------------------------------");

        //15den 100e kadar olan sayıları yan yana konsola yazdırın
        for (int i = 15; i <= 100; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------");


        //0 dan 100e kadar olan sayıları tersten konsola yazdırın

        for (int i = 100; 0 <= i; i--) {

            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------------");

        // bir program yazın ve 0-100 arasındakı sayıların toplamını konsola yazdırsın
        int sum = 0;
        for (int i = 1; i <= 100; ++i) {
            sum += i; //sum=sum+i;
            System.out.println("Sum = " + sum);
        }
        System.out.println("-------------------------------------------");

        //bir program yazın ve 1-20ye kadar olan sayıların kuplerını konsola yazdırsın

        for (int i = 1; i <= 20; ++i) {
            System.out.println(i + " " + i * i * i);

        }

        System.out.println("-------------------------------------------");


        //ornek:23 derece ile 50 derece arasında olan fahrenheit
        //degerlerını ekrana yazdırın.(C=(F-32) / 1.8) F=1.8C+32 F

        for (int i = 23; i <= 50; ++i) {
            double f = i * 1.8 + 32;
            System.out.println(i + "C= " + f);


        }

        //A dan z ye kada olan harflerı ekrana yazdırın
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " ");
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " ");
        }

        System.out.println("--------------------------------------" );
        //ornek: 9 sayısının carpım tablosunu yazdırınız.
        for (int i=1;i<=10;i++){
            System.out.println("9 * "+i+" = "+9*i);
        }

    }
}


