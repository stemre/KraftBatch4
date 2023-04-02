package day11_ControlFlowStatments_IF;

public class C06_IF_ELSE {
    public static void main(String[] args) {
/*
        int a = 30;
        int b = 30;
        if (a > b) {
            System.out.println("A buyuktur B den");
        } else if (a == b) {
            System.out.println("A ve B esıttır ");
        } else {
            System.out.println("B buyuktur A dan");
        }


        System.out.println("A");
        if (true) {
            System.out.println("B");
        } else if (false) {
            System.out.println("C");
        } else if (false) {
            System.out.println("D");
        } else if (false) {
            System.out.println("E");
        } else if (false) {
            System.out.println("F");
        } else if (false) {
            System.out.println("G");
        } else {
            System.out.println("H");
        }
        System.out.println("I");


        int x = 30, y = 0;
        if (x == 10) {
            y = 20;
        } else if (x == 20) {
            y = 30;
        } else if (x == 30) {
            y = 40;
        }else{
            System.out.println("x bulunamadı ");
        }
        System.out.println("y = " + y);

        String str = "";
        int degree = 25;
        if (degree >= 20) {
            str = "butterfly flıes";
        }else{
            str="";
        }
        System.out.println(str);


        int aysePara=4;

        if (aysePara <5){
            aysePara=aysePara+10;
        }
        System.out.println("Aysenın parası: "+aysePara);

        int x = 20;
        int y = 15;
        if (x > y) {
            System.out.println(x);
        } else if (x == y) {
            System.out.println("Sayılar esıt buyuk sayı yok");
        } else {
            System.out.println(y);
        }

        int a, b, c;
        a = 20;
        b = 30;
        c = 30;
        if ((a + b) > c) {
            //c=Math.abs((a-b));
            //c=Math.abs(a,b)-Math.min(a,b);

            if((a-b)>=0){
                c=a-b;
            }else{
                //c=-(a-b);
                c=b-a;
            }
        }
        System.out.println(c);

        int x, y, z;
        x = 60;
        y = 60;
        z = 60;
        if((x+y+z)==180){
            System.out.println("Bu bir ucgendır");
        }else{
            System.out.println("ucgen degıldır");
        }
        */
        int x,y,z;
         x=60;
         y=90;
         z=60;
        if(x+y+z==180){
            if (x==90|| y==90|| z==90){
                System.out.println("bu bır dık ucgendır");
            }
            else{
                System.out.println("bu bır dık ucgen degıldır");
            }

        }
        //Bir program yazın
// 3 tane numara kabul etsin ve büyük olanı versin.(homework)
// 2 veya 3 farklı yol ile çözmeye çalışın
    }

}


