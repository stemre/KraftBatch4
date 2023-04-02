package day18_CustomMethods;

public class C02_CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("--------------------");
        countdownTenToZero();
        System.out.println("--------------------");
        evennumbers();
    }

    public static void helloWorld5Times() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello world");
            System.out.println("hello world");
        }
    }

    public static void countdownTenToZero() { //countdown = geri sayım
        for (int i = 10; 0 <= i; i--) {
            System.out.println(i);
        }
    }

    private static void evennumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i+" ");
        }
    }
}
