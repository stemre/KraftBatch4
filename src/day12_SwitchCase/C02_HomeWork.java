package day12_SwitchCase;

public class C02_HomeWork {
    public static void main(String[] args) {

        //  int x,y,z;
//        y=60;
        //  z=15;
        //        System.out.println("max değer: "+(Math.max(Math.max(x,y),z)));
        //if(x>=y&&x>=z){
        // System.out.println(x);
        //} else if (y>=x&&y>=z) {
        //System.out.println(y);
// }else {
        // System.out.println(z);

        int x, y, z;
        x = 40;
        y = 40;
        z = 30;

      if(x==y){
          System.out.println(x);
      } else if (x==z) {
          System.out.println(x);
      } else if (y==z) {
          System.out.println(y);
      } else {
            System.out.println("Esıt sayı yok");
        }


    }
}
