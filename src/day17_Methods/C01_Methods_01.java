package day17_Methods;

public class C01_Methods_01 {
    public static void main(String[] args) {
        int x=6;
        if (x==5){
            hello();
        } else if (x==6) {
            menu();
        }


    }
        public static void menu () {
            System.out.println("1:para çekme 2:para yatırma 3:bakiye 4:çıkış");
        }
        public static void hello(){
            System.out.println("bankamıza hos geldınız");
        }

}