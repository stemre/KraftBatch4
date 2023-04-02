package day17_Methods;

public class Task2 {
    public static void main(String[] args) {
        büyükSayi();
    }

    // TASKS
    // Bir method yazın 2 sayıdan büyük olanı versin
    public static void büyükSayi() {
        int x = 30, y = 20;
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        System.out.println("En buyuk sayi: " + max);
    }


}
