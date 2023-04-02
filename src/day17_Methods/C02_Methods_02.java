package day17_Methods;

public class C02_Methods_02 {
    public static void main(String[] args) {
        message3();
    }

    public static void message1() {
        message3();
        System.out.println("1");
    }

    public static void message2() {
        message1();
        System.out.println("2");
    }

    public static void message3() {
        System.out.println("3");
        message2();
    }
}
